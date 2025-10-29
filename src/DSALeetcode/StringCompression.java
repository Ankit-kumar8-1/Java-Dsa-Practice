package DSALeetcode;

public class StringCompression {
    public  static  int leng (char chars[]){
        int read = 0;
        int write  = 0;

        while ( read < chars.length){
            char currchar =  chars[read];
            int count =0 ;
            while (read<chars.length && currchar == chars[read]){
                read++;
                count++;
            }

            chars[write++]= currchar;
            if(count>1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[write++] = c;
                }
            }

        }

        return write;

    }


}
