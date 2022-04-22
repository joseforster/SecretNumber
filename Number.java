    public class Number {

        private int secretNumber;
        
        private int[] numbers;

        public Number(){

            this.secretNumber  = (int)Math.round(Math.random() * 100);

            int[] numbers = new int[100];

            for(int i = 0; i < numbers.length;i++){
                numbers[i] = i;
            }

            this.numbers = numbers;
        }

        public int[] getNumbers(){
            return this.numbers;
        }

        public boolean isSecretNumber(int guess){
            if (guess == this.secretNumber){
                return true;
            }else{
                return false;
            }
        }

        public boolean isRightSide(int guess, int[] numbers){

            int sizeSmallerNumbers;
            int sizeBiggerNumbers;

            // if the size of the array is an odd number, the array will be divid in two, both with differents sizes
            if(numbers.length % 2 > 0){

                sizeSmallerNumbers = (int) Math.floor((double)(numbers.length/2.0));

                sizeBiggerNumbers = (int) Math.ceil((double)(numbers.length/2.0));

            }else{

                sizeSmallerNumbers = numbers.length/2;
                sizeBiggerNumbers = numbers.length/2;
            }


            int[] arraySmallerSize = new int[sizeSmallerNumbers];
            int[] arrayBiggerSize = new int[sizeBiggerNumbers];

            // setting the value of each array on position 0;
            int beginSmallerSize = numbers[0];
            int beginBiggerSize = numbers[numbers.length/2];

            // if score equals 2, it means that guess and secret number are in same side (same array)
            int scoreSmallerSize = 0;
            int scoreBiggerSize = 0;

            for(int i = 0; i < sizeSmallerNumbers; i++){

                // checks if the value of that positions is the secret number or the guess
                if(beginSmallerSize == guess || beginSmallerSize == this.secretNumber){
                    scoreSmallerSize += 1;
                }
                
                arraySmallerSize[i] = beginSmallerSize;

                beginSmallerSize++;
            }

            for(int i = 0; i < sizeBiggerNumbers; i++){

                if(beginBiggerSize == guess || beginBiggerSize == this.secretNumber){
                    scoreBiggerSize += 1;
                }
                
                arrayBiggerSize[i] = beginBiggerSize;

                beginBiggerSize++;
            }

            // if the array scored 2 points, it will be referenced by the atribbute Numbers
            if(scoreSmallerSize == 2){
                this.numbers = arraySmallerSize;
                return true;
            }

            if(scoreBiggerSize == 2){
                this.numbers = arrayBiggerSize;
                return true;
            }

            return false;

        }
    }