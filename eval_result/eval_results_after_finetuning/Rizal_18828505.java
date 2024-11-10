
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
        int range=max - min;
        txtRange.setText(Integer.toString(range));

    }
});

    
