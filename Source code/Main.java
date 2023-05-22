import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int vehicles_cnt=0;
int income_cnt=0;

        boolean activity=false;
        Scanner num = new Scanner(System.in);
        System.out.print(" Enter number of slots of the garage: ");
        int NumberOfSlots = num.nextInt();
        LocalTime arr_time[] = new LocalTime[NumberOfSlots+1];
        Slot arrOfSlots[] = new Slot[NumberOfSlots+1];
        for(int i=1;i<=NumberOfSlots;i++){
            Scanner wid = new Scanner(System.in);
            System.out.print("Enter the width of the slot of number " +i+ " : ");
            double width = wid.nextDouble();

            Scanner dep = new Scanner(System.in);
            System.out.print("Enter the depth of the slot of number "+i+" : ");
            double Depth = dep.nextDouble();

            Slot obj = new Slot(i,width,Depth,activity);
            arrOfSlots[i]=obj;
        }
        ParkIn first = new FirstServed();
        ParkIn best = new BestFit();
        Display disp = new Display();
        ParkOut out_ = new ParkOut();
        CalculateFees fees_ = new CalculateFees();
        TotalVehicles t_v = new TotalVehicles();
        Total_Income t_i = new Total_Income();


        System.out.println("Choose From The Menu the option you want.");
        System.out.println("(1) Activate Park in Method.");
        System.out.println("(2) Display Available Parking Slot.");
        System.out.println("(3) Activate Park out Method.");
        System.out.println("(4) Calculate Total Vehicles Used The Garage In That Point");
        System.out.println("(5) Calculate Total Income In That Point ");
        System.out.println("(6) Exit.");
        Scanner scanner = new Scanner(System.in);
        int choice2 = scanner.nextInt();
        while(choice2!=6){
            if(choice2==1){
                Scanner MN = new Scanner(System.in);
                System.out.print("Enter the Model Name of the vehicle: ");
                String ModelName = MN.nextLine();

                Scanner MY = new Scanner(System.in);
                System.out.print("Enter the Model Year of the vehicle: ");
                int ModelYear = MY.nextInt();

                Scanner IDNum = new Scanner(System.in);
                System.out.print("Enter the identification number of the vehicle: ");
                int IdentificationNumber = IDNum.nextInt();

                Scanner Vwid = new Scanner(System.in);
                System.out.print("Enter the width of the vehicle: ");
                double VehicleWidth = Vwid.nextDouble();

                Scanner Vdep = new Scanner(System.in);
                System.out.print("Enter the depth of the vehicle: ");
                double VehicleDepth = Vdep.nextDouble();

                Vehicle v1 = new Vehicle(ModelName, ModelYear, IdentificationNumber, VehicleWidth, VehicleDepth);
                System.out.println("Choose The number of the Method of Parking.");
                System.out.println("(1) First come first served slots");
                System.out.println("(2) Best-fit approach the vehicle");
                Scanner conf = new Scanner(System.in);
                 int config_choice = conf.nextInt();
                 if(config_choice==1) {
                     boolean v_check = first.ParkIn_config(NumberOfSlots, arrOfSlots, v1,arr_time);
                     if(v_check){
                         vehicles_cnt++;}
                 }
                 else if (config_choice==2){
                     boolean v2_check = best.ParkIn_config(NumberOfSlots, arrOfSlots, v1,arr_time);
                     if(v2_check){
                         vehicles_cnt++;}
                 }
            }
            else if (choice2==2) {
                disp.DisplayAvailableSlots(NumberOfSlots, arrOfSlots);
            }

            else if(choice2==3){
                System.out.println("please enter the ID of the slot you want to get car out of it");
                Scanner cc = new Scanner(System.in);
                int ID_out = cc.nextInt();


                if (arrOfSlots[ID_out].IsEmpty()) {

                    throw new ArithmeticException("The Slot Is Already Empty (NO CAR PARKED HERE ! )");}

                else {
                LocalTime T1 = out_.park_out();
                arrOfSlots[ID_out].SlotActivity(false);
                income_cnt+=fees_.fees_calc(arr_time[ID_out],T1);

            }

                }

            else if(choice2==4){
                t_v.vehicles_calc(vehicles_cnt);

            }

            else if(choice2==5){
                t_i.income_calc(income_cnt);


            }

            System.out.println("Choose From The Menu the option you want.");
            System.out.println("(1) Activate Park in Method.");
            System.out.println("(2) Display Available Parking Slot.");
            System.out.println("(3) Activate Park out Method.");
            System.out.println("(4) Calculate Total Vehicles Used The Garage In That Point");
            System.out.println("(5) Calculate Total Income In That Point ");
            System.out.println("(6) Exit.");

            choice2 = scanner.nextInt();
        }
        System.out.println("You Quited The Program.");
    }

}