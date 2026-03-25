package sam.learning;

public class RobotsBoundInCircles {
        public boolean isRobotBounded(String instructions) {
            int i=0, j=0;
            int pos = 0; //North=0, East =1. South =2, West =3

            for(char ch : instructions.toCharArray()) {
                if(ch == 'G') {
                    if(pos == 0) j++; //y axis
                    if(pos == 1) i++; //x axis
                    if(pos == 2) j--;
                    if(pos == 3) i--;
                } else if(ch == 'L') {
                    pos = (pos+3)%4;
                } else {
                    pos = (pos+1)%4;
                }
            }

            return (i==0 && j ==0) || pos !=0;

    }
}
