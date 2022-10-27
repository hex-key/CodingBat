public String withoutX2(String str) {
  String ret = "";
  if (str.length() > 1) {
    ret = str.substring(2, str.length());
    for (int i = 1; i >= 0; i--) {
      if (str.charAt(i) != 'x') {
        ret = str.charAt(i) + ret;
      }
    }
  } else {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != 'x') {
        ret += str.charAt(i);
      }
    }
  }
  return ret;
}
