Title: how to get the minimum,maximum value of an array? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Finding the max/min value in an array of primitives using Java
                            
                                (17 answers)
                            
                    
                Closed 8 years ago.
        


    

Here's my code. I need to get the minimum,maximum value of my array to be able for me get the range, whenever I input numbers the minimum value is 0. Please help me. Thank you:)

final AutoCompleteTextView inputValues = (AutoCompleteTextView) findViewById(R.id.txt_input);
final TextView txtMinimum = (TextView) findViewById(R.id.txtMinimum);
final TextView txtMaximum = (TextView) findViewById(R.id.txtMaximum);
final TextView txtRange = (TextView) findViewById(R.id.txtRange);

Button btncalculate = (Button)findViewById(R.id.btncalculate);
btncalculate.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View arg0) {
        String []values = ( inputValues.getText().toString().split(","));
        int[] convertedValues = new int[values.length];

        // calculate for the minimum and maximum number
        int min = 0;
        int max=0;

        min = max = convertedValues[0];
        for (int i = 0; i < convertedValues.length; ++i) {
            convertedValues[i] =Integer.parseInt(values[i]);
            min = Math.min(min, convertedValues[i]);
            max = Math.max(max, convertedValues[i]);
        }
        txtMinimum.setText(Integer.toString(min));
        txtMaximum.setText(Integer.toString(max));

        // calculate for the range
        txtRange.setText(Integer.toString(max-min));
    }
});

    
Answer: 
     
You can use the Math.min() and Math.max() method in java.

int a = 10;
int b = 20;
int c = Math.min(a, b);
int d = Math.max(a, b);

    
Code: int a = 10;
int b = 20;
int c = Math.min(a, b);
int d = Math.max(a, b);

Complete the code as a full Java method.

# Answer

