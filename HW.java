public class JavaTime {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( "SimpleDateFormat(\"HH:mm:ss\")" +sdf.format(cal.getTime()) );

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss\")" + dateFormat.format(date)); //2016/11/16 12:08:43

//        DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Calendar cal = Calendar.getInstance();
//        System.out.println("SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss\")" + dateFormat2.format(cal)); //2016/11/16 12:08:43

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("DateTimeFormatter.ofPattern(\"yyyy/MM/dd HH:mm:ss\")" + dtf.format(now)); //2016/11/16 12:08:43

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        System.out.println("DateTimeFormatter.ofPattern(\"yyyy/MM/dd\")" + dtf2.format(localDate)); //2016/11/16

        Date dd = new Date();
        System.out.println("new Date()" + dd); //2016/11/16 12:08:43



    }
