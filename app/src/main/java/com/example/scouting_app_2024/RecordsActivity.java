package com.example.scouting_app_2024;

import android.widget.CheckBox;

public class RecordsActivity {
    public static class Info {
        //main activity
        public static String scoutName = "";
        public static String matchNumber = "";
        public static String teamNumber = "";
        public static boolean preload = false;
        public static byte driverStation = 0;
        public static byte fieldPosition = 0;
        //auto activity
        public static boolean leave = false;

        //stage activity
        public static String climbLevel = "";
        public static String comments = "";
        public static byte autoLevel4;
        public static byte autoLevel3;
        public static byte autoLevel2;
        public static byte autoTrough;
        public static byte autoProcessor;
        public static byte autoNet;
        public static byte autoTOR;

        public static byte teleLevel4;
        public static byte teleLevel3;
        public static byte teleLevel2;
        public static byte teleTrough;
        public static byte teleProcessor;
        public static byte teleNet;
        public static byte teleTOR;

        public static boolean died = false;
        public static boolean broke = false;
        public static boolean defense = false;
        public static boolean aCheck = false;
        public static boolean bCheck = false;
        public static boolean cCheck = false;
        public static boolean dCheck = false;
        public static boolean eCheck = false;
        public static boolean fCheck = false;
        public static boolean gCheck = false;
        public static boolean hCheck = false;
        public static boolean iCheck = false;
        public static boolean jCheck = false;
        public static boolean kCheck = false;
        public static boolean lCheck = false;





        /**
         * Turns a boolean into either a 1 or 0 for the JSON file
         *
         * @param checkBox boolean value being passed in from the checkboxes
         *
         * @return 1 or 0
         */
        public static int printBoolean(boolean checkBox) {
            if(checkBox){
                return 1;
            } else {
                return 0;
            }
        }

        /**
         * Takes all your values from Records.java and puts them into a formatted JSON file with titles
         *
         * @return full JSON file with all of the values
         */
        public static String CreateJSON() {
            //main activity
            String json = String.format("{\"Name\": \"%s\",",scoutName);
            json += String.format("\"Match\": \"%s\",",matchNumber);
            json += String.format("\"Team\": \"%s\",",teamNumber);
            json += String.format("\"Preload\": \"%d\",",printBoolean(preload));
            json += String.format("\"Station\": \"%s\",",driverStation);
            json += String.format("\"Pos\": \"%s\",",fieldPosition);
            //auto activity
            json += String.format("\"Leave\": \"%d\",",printBoolean(leave));


            json += String.format("\"AutoLevel4\": \"%s\",",autoLevel4);
            json += String.format("\"AutoLevel3\": \"%s\",",autoLevel3);
            json += String.format("\"AutoLevel2\": \"%s\",",autoLevel2);
            json += String.format("\"AutoTrough\": \"%s\",",autoTrough);

            json += String.format("\"AutoNet\": \"%s\",",autoNet);
            json += String.format("\"AutoTOR\": \"%s\",",autoTOR);
            json += String.format("\"AutoProcessor\": \"%s\",",autoProcessor);


            //stage activity
            json += String.format("\"ClimbLevel\": \"%s\",",climbLevel);

            json += String.format("\"Comments\": \"%s\",}",comments);

            json += String.format("\"TeleLevel4\": \"%s\",",teleLevel4);
            json += String.format("\"TeleLevel3\": \"%s\",",teleLevel3);
            json += String.format("\"TeleLevel2\": \"%s\",",teleLevel2);
            json += String.format("\"TeleTrough\": \"%s\",",teleTrough);

            json += String.format("\"TeleNet\": \"%s\",",teleNet);
            json += String.format("\"TeleTOR\": \"%s\",",teleTOR);
            json += String.format("\"TeleProcessor\": \"%s\",",teleProcessor);
            json += String.format("\"Died\": \"%d\",",printBoolean(died));
            json += String.format("\"Broke\": \"%d\",",printBoolean(broke));
            json += String.format("\"Defense\": \"%d\",",printBoolean(defense));

            json += String.format("\"ACheck\": \"%d\",",printBoolean(aCheck));
            json += String.format("\"BCheck\": \"%d\",",printBoolean(bCheck));
            json += String.format("\"CCheck\": \"%d\",",printBoolean(cCheck));
            json += String.format("\"DCheck\": \"%d\",",printBoolean(dCheck));
            json += String.format("\"ECheck\": \"%d\",",printBoolean(eCheck));
            json += String.format("\"FCheck\": \"%d\",",printBoolean(fCheck));
            json += String.format("\"GCheck\": \"%d\",",printBoolean(gCheck));
            json += String.format("\"HCheck\": \"%d\",",printBoolean(hCheck));
            json += String.format("\"ICheck\": \"%d\",",printBoolean(iCheck));
            json += String.format("\"JCheck\": \"%d\",",printBoolean(jCheck));
            json += String.format("\"KCheck\": \"%d\",",printBoolean(kCheck));
            json += String.format("\"LCheck\": \"%d\",",printBoolean(lCheck));

            return json;
        }

        /**
         * clears all values from Records.java
         */
        public static void clear(){
            //main activity
            matchNumber = Integer.toString(Integer.decode(matchNumber)+1);
            teamNumber = "";
            preload = false;
            fieldPosition = 0;
            //auto activity
            leave = false;

            autoLevel4=0;
            autoLevel3=0;
            autoLevel2= 0;
            autoTrough = 0;
            autoProcessor = 0;
            autoNet = 0;
            autoTOR = 0;
            //tele activity


            teleLevel4 =0;
            teleLevel3 =0;
            teleLevel2 =0 ;
            teleTrough =0;
            teleProcessor = 0;
            teleNet = 0;
            teleTOR = 0;
            died = false;
            defense = false;
            broke = false;
            //stage activity

            comments = "";
            climbLevel = "";
           aCheck = false;
           bCheck = false;
           cCheck = false;
           dCheck = false;
           eCheck = false;
           fCheck = false;
           gCheck = false;
           hCheck = false;
           iCheck = false;
           jCheck = false;
           kCheck = false;
           lCheck = false;

        }
    }
}