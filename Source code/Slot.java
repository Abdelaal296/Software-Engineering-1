    public class Slot {
        private int slot_ID;
        private double SlotWidth;
        private double SlotDepth;
        private boolean active;
        public Slot(){
            slot_ID=0;
            SlotWidth=0;
            SlotDepth=0;
            active = false;
        }
        public Slot(int s_ID, double w, double d, boolean a) {
            slot_ID = s_ID;
            SlotWidth = w;
            SlotDepth = d;
            active = a;
        }
        void SlotActivity(boolean a){
            active=a;
        }
        public double GetSlotWidth(){
            return SlotWidth;
        }
        public double GetSlotDepth(){
            return SlotDepth;
        }
        public boolean GetActivity(){
            return active;
        }
        public boolean IsEmpty(){
            if(active){
                return false;
            }
            else{
                return true;
            }
        }
    }
