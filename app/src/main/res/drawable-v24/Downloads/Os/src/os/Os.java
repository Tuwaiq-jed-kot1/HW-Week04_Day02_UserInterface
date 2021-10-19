/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author sh-sh
 */
public class Os {
    //to store the weighted sum of the remaining burst times in the ready queue.

    public static int SR;
//to store the weighted average of the burst times by dividing the value found in the SR by the countof processes found in the ready queue.
    public static int AR;
    public static int currentMemory;
    public static int currentDevices;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A 1 J=1 M=30 S=0 R=10 P=1");
        StringBuilder results = new StringBuilder();
        File file = new File("input1.txt");
        Scanner read = new Scanner(file);
        //AlljopQ is Q used to store valid jobs from input file for a configuration
        //QueueLL AlljopQ = new QueueLL();
        QueueLL HoldQueue_1 = new QueueLL();//ReadyQ
        QueueLL HoldQueue_2 = new QueueLL();
        QueueLL completeJQ = new QueueLL();
        int Systime, timeQuantum, maxMemory = 0,totalDevices = 0, currentTime;
        currentMemory = 0;  currentDevices = 0; 
        //time of the next internal event
        int timeintevent;
        //denote the time on the next input command
        int timenextinput;
        int arrivesTime, jobNumber, requiresMemo, holdDevices, burstTime, priority;
        while (read.hasNextLine()) {

            String[] commandArgument = read.nextLine().split(" ");
            if (commandArgument[0].equals("C")) {
                Systime = Integer.parseInt(commandArgument[1]);
                maxMemory = Integer.parseInt(commandArgument[2].substring(2));
                currentMemory = maxMemory;
                totalDevices = Integer.parseInt(commandArgument[3].substring(2));
                currentDevices = totalDevices;

            } else if (commandArgument[0].equals("D")) {
//to determine the end of this system configuration

                currentTime = Integer.parseInt(commandArgument[1]);

            } else if (commandArgument[0].equals("A")) {
                arrivesTime = Integer.parseInt(commandArgument[1]);
                jobNumber = Integer.parseInt(commandArgument[2].substring(2));
                requiresMemo = Integer.parseInt(commandArgument[3].substring(2));
                holdDevices = Integer.parseInt(commandArgument[4].substring(2));
                burstTime = Integer.parseInt(commandArgument[5].substring(2));
                priority = Integer.parseInt(commandArgument[6].substring(2));
                //Check if more resources are needed than the system contains then do not even consider the jobs
                // if (requiresMemo <= maxMemory && holdDevices <= totalDevices) {
                //    AlljopQ.enqueue(new QueueNode(arrivesTime, jobNumber, requiresMemo, holdDevices, burstTime, priority));
                //}
                enqueue(HoldQueue_1, HoldQueue_2, maxMemory, currentMemory, totalDevices, currentDevices,
                        arrivesTime, jobNumber, requiresMemo, holdDevices, burstTime, priority);
//               System.out.println("A "+arrivesTime+" J="+jobNumber+" M="+requiresMemo+
//                       " S="+holdDevices+" R="+runTime+" P="+priority+"");
            } else {
            }

        }

//        eventTime(HoldQueue_1, HoldQueue_2);
        read.close();
        System.out.println(results);
        File outputFile = new File("output_DRR__1.txt");
        PrintWriter out = new PrintWriter(outputFile);
        out.print(results);
        out.close();
    }

    public static void enqueue(QueueLL HoldQueue_1, QueueLL HoldQueue_2, int main_memory, int currentMemory, int totalDevices, int currentDevices,
             int arrivesTime, int jobNumber, int requiresMemo, int holdDevices, int burstTime, int priority) {
        if (requiresMemo > main_memory || holdDevices > totalDevices) {
            // the job is rejected never gets to one of the Hold Queues.

        } else if (requiresMemo > currentMemory || holdDevices > currentDevices) {

            HoldQueue_2.enqueue(new QueueNode(arrivesTime, jobNumber, requiresMemo, holdDevices, burstTime, priority));

        } else {
            HoldQueue_1.enqueue(new QueueNode(arrivesTime, jobNumber, requiresMemo, holdDevices, burstTime, priority));

        }

    }

    public static void currentTime() {

    }

    public static void roundRobin(QueueLL HoldQueue_2, QueueLL HoldQueue_1, QueueLL completeJQ,
            int currentDevices, int currentMemory, int timeQuantum, int Systime) {
        //The algorithm of Dynamic Round Robin      

        //HoldQueue_2    
        //P Enters Hold queue 1
        if (HoldQueue_2.peeknode().getrequiresMemo() <= currentMemory && HoldQueue_2.peeknode().getholdDevices() >= currentDevices) {
            QueueNode tem = HoldQueue_2.dequeue();
            HoldQueue_1.enqueue(tem);
            currentDevices = currentDevices - tem.getholdDevices();
            currentMemory = currentMemory - tem.getrequiresMemo();
            //Increase SR when you add a job to ready Q ???
            SR = sumwWighted(HoldQueue_1);
        } else {
        }

// Process p is loaded from Hold queue 1 into the CPU to be executed
        //CPU( HoldQueue_1.dequeue(),timeQuantum);
        QueueNode temProcess = HoldQueue_1.dequeue();

        //For the first process, it begins with time quantum equals to the burst time of first process 
        if (temProcess.getjobNumber() == 1) {
//set the time Quantum according to burst Time of first job
            timeQuantum = temProcess.getrunTime();
        }
        temProcess.setrunTime(temProcess.getrunTime() - timeQuantum);
// IF (Hold queue 1 is Empty)
        if (HoldQueue_1.isEmpty()) {
//TQ=BT (p)?  

//Update SR and AR ?
        }
        //IF (Hold queue 1 is not empty)
        if (!HoldQueue_1.isEmpty()) {
//TQ=AVG (BT of processes in Hold queue 1)
            timeQuantum = AVGBT(HoldQueue_1);

            //Update SR and AR
            SR = sumwWighted(HoldQueue_1);
            AR = SR / HoldQueue_1.countofNode();
        }
        //CPU executes P by TQ time
        //IF (P is terminated)
        if (temProcess.getrunTime() == 0) {
            //Update SR and AR
            SR = sumwWighted(HoldQueue_1);
            AR = SR / HoldQueue_1.countofNode();
            completeJQ.enqueue(temProcess);
        } else {//IF (P is not terminated)
            //Return p to the Hold queue 1 with its updated burst time
            HoldQueue_1.enqueue(temProcess);
            //Update SR and AR  
            SR = sumwWighted(HoldQueue_1);
            AR = SR / HoldQueue_1.countofNode();
        }
        //release of main memory and Devices
        currentDevices = currentDevices + temProcess.getholdDevices();
        currentMemory = currentMemory + temProcess.getrequiresMemo();

    }

    /**
     * private static void CPU(QueueNode dequeue, int timeQuantum) { }
     */
    private static int AVGBT(QueueLL HoldQueue_1) {
        int avgBT = 0;
        int sum = 0;
// We need to traverse...so we need a help ptr
        QueueNode helpPtr = HoldQueue_1.peeknode();
        // Traverse to correct insertion point
        while (helpPtr != null) {
            sum = (helpPtr.getrunTime()) + sum;
            // Step one node over
            helpPtr = helpPtr.getNext();
        }
        avgBT = sum / HoldQueue_1.countofNode();
        return avgBT;
    }
//returns the weighted sum of the remaining burst times in the ready queue

    private static int sumwWighted(QueueLL HoldQueue_1) {
        int sum = 0;
// We need to traverse...so we need a help ptr
        QueueNode helpPtr = HoldQueue_1.peeknode();
        // Traverse to correct insertion point
        while (helpPtr != null) {
            sum = (helpPtr.getrunTime() * helpPtr.getWeight()) + sum;
            // Step one node over
            helpPtr = helpPtr.getNext();
        }

        return sum;
    }
}
