package co.gymglishproject.mobile.gymglishproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ListViewFragment extends Fragment {

    ListViewAdapter listViewAdapter;
    ListView listView;
    ArrayList<WebSite> data;

    public ListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list_view, container, false);


        data = new ArrayList<>();
        data.add(new WebSite("https://www.gymglish.com/he/","https://fastly-a9fast-com.glob" +
                "al.ssl.fastly.net/www.gymglish.com/images/animation-home-delavigne-rond-rouge-500x341-transparent-sans-rond.png"));
        data.add(new WebSite("http://www.frantastique.com/","https://fastly-a9fast-com.global.ssl.fastly.net/www.frantastique.com/images/Paris-illustrat" +
                "ions360-200.png"));
        data.add(new WebSite("http://www.vatefaireconjuguer.com/","http://www.vatefaireconjuguer.com/images/logo-vatefaireconjuguer.png"));


        listView = (ListView) v.findViewById(R.id.listView);
        listViewAdapter = new ListViewAdapter(getActivity(), R.layout.row, data);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                WebViewActivity webViewActivity = (WebViewActivity) getActivity();
                webViewActivity.changeSite(data.get(position));


            }
        });


        return v;
    }

}
