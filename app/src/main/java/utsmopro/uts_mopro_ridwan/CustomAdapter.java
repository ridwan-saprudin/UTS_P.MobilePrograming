package utsmopro.uts_mopro_ridwan;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {
    private final String[] body;
    private final Activity context;
    private final String[] header;

    public CustomAdapter(Activity context, String[] header, String[] body) {
        super(context, R.layout.custom_adapter, header);
        this.context = context;
        this.header = header;
        this.body = body;
    }

    public View getView(int position, View view, ViewGroup parent) {
        View rowView = this.context.getLayoutInflater().inflate(R.layout.custom_list, null, true);
        TextView bodyTeks = (TextView) rowView.findViewById(R.id.description_list);
        ((TextView) rowView.findViewById(R.id.title_list)).setText(this.header[position]);
        if (this.body != null) {
            bodyTeks.setText(this.body[position]);
        } else {
            bodyTeks.setVisibility(8);
        }
        return rowView;
    }
}
