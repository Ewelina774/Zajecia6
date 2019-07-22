class Points {


    String quarter(int a, int b) {
        if (a > 0 && b > 0)
            return "w I ćwiartce";
        else if (a < 0 && b > 0)
            return "w II ćwiartce";
        else if (a < 0 && b < 0)
            return "w III ćwiartce";
        else if (a > 0 && b < 0)
            return "w IV ćwiartce";
        else
            return "na osi";
    }

}
