package ufpb.br.trigger.istetic;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class AdaptadorFragmento extends FragmentStatePagerAdapter {

    private String [] tableTitle;

    public AdaptadorFragmento(FragmentManager fm, String[] stringArray) {
        super(fm);
        this.tableTitle = tableTitle;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentoFornecedor();
            case 1:
                return new FragmentoEstabelecimento();
            case 2:
                return new FragmentoConcluido();
        }

        return null;
    }


    @Override
    public int getCount() {
        return this.tableTitle.length;
    }

    @Override
    public CharSequence getPageTitle (int position) {
        return this.tableTitle[position];
    }
}

