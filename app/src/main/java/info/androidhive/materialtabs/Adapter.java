package info.androidhive.materialtabs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import info.androidhive.materialtabs.activity.BangunRuang;
import info.androidhive.materialtabs.fragments.ThreeFragment;

public class Adapter extends RecyclerView.Adapter<Adapter.MahasiswaViewHolder> {


    private ArrayList<BangunRuang> dataList;

    public Adapter(ArrayList<BangunRuang> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.viewitem, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtLuas.setText(dataList.get(position).getNpm());
        holder.txtVolume.setText(dataList.get(position).getNohp());
        holder.txtKeliling.setText(dataList.get(position).getKeliling());
    }




    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtLuas, txtVolume, txtKeliling;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txtnama);
            txtLuas = (TextView) itemView.findViewById(R.id.txtLuas);
            txtVolume = (TextView) itemView.findViewById(R.id.txtVolume);
            txtKeliling = (TextView) itemView.findViewById(R.id.txtKeliling);

        }
    }
}



