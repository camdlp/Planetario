package carlosabia.prueba.proyecto.planetario;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Planeta extends Fragment {


    public Planeta() {
        // Required empty public constructor
    }
    //public Planeta(int id){

    //}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //al principio solo estaba el return con el fragmento_tierra
        System.out.println(getId());
        System.out.println(R.id.tierra);
        return inflater.inflate(R.layout.fragment_tierra, container, false);




    }


}
