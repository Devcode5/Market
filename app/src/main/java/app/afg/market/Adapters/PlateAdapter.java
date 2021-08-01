package app.afg.market.Adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlateAdapter  extends RecyclerView.Adapter<PlateAdapter.PlateViewHolder> {




    @NonNull
    @Override
    public PlateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlateViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PlateViewHolder extends RecyclerView.ViewHolder {

         public PlateViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
