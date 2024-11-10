


value=value.replace("*",".*");//replace  * with .*


This won't work if your value contain +,? since they all have special meaning in regex.Escape them if their are any..

String qwerty=null;
if(equality.equals("=")){
    qwerty=valueFromHeader.equals(value);
}else if(equality.equals("!=")){
    qwerty=!valueFromHeader.equals(value);
}

OR

String qwerty="";
char equalitys[]={'=','!','='};
int i=equalitys.length;
for(int j=0;j<i;j++){
    if(equalitys[j]==equality.charAt(0)){
        switch(equalitys[j]){
            case '=':
                qwerty=valueFromHeader.