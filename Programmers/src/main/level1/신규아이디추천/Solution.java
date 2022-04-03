class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        String tmp = "";
        for (byte val : new_id.getBytes()) {
            if (((val >= 'a' && val <= 'z') || (val >= '0' && val <= '9') || (val == '-') || (val == '_') || (val == '.'))) {
                tmp += (char) val;
            }
        }
        new_id = tmp;
        

        byte prev = 0;
        tmp = "";
        for (byte val : new_id.getBytes()) {
            if (!((val == '.') && (prev == val))) {
                prev = val;
                tmp += (char) val;
            }
        }
        new_id = tmp;
        
        if (new_id.length() >= 1 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1, new_id.length());
        }

        
        if (new_id.length() >= 1 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if (new_id.length() == 0) {
            new_id = "a";
        }


        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.length() >= 1 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        return new_id;
    }
}
