package zly.com.fruitsFight;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class czFragment extends Fragment {


    public czFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab02, container, false);
    }

}
