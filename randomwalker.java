public class RandomWalker

{
              public static void main(String[] args) {

                  int randomNumber =0;

                             double distanceBetweenPoints = 0.0;

                  int posX =0, posY=0;

                             int newPosX =posX;
                             int newPosY =posY;
                             int number = Integer.parseInt(args[0]);

        int count =0;
        System.out.println("(" + newPosX + "," + newPosY + ")");
        while(count < number)

        {
            randomNumber = (int)(System.currentTimeMillis()%(3*count+11));
            randomNumber = (randomNumber %4)+1;

            if (randomNumber == 1)
                newPosX += 1;

            else if(randomNumber == 2)
                newPosX-=1;
           
             else if (randomNumber == 3)
                newPosY+=1;
          
              else
                newPosY-=1;

            System.out.println("(" + newPosX + "," + newPosY + ")");
            count++;
        }
           
            distanceBetweenPoints = (newPosX-posX)*(newPosX-posX) + (newPosY-posY)*(newPosY-posY);
            System.out.println("Squared distance = " + distanceBetweenPoints);

                            

              }

}