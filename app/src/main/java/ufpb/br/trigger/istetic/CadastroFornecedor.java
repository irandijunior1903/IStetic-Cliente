package ufpb.br.trigger.istetic;

import android.content.Context;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


public class CadastroFornecedor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cadastro_fornecedor);
        ViewPager viewPager =  findViewById(R.id.view_pager);

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }


    public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

        private Context mContext;


        public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
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
                default:
                    return null;
            }
        }


        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            switch (position) {
                case 0:
                    return mContext.getString(R.string.cadastro_fornecedor);

                case 1:
                    return mContext.getString(R.string.cadastro_estabelecimento);
                case 2:
                    return mContext.getString(R.string.cadastro_concluido);

                default:
                    return null;
            }
        }

    }
}

