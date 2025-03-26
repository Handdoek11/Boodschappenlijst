package j5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
abstract class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static View a(RecyclerView.F f8) {
        if (f8 instanceof i) {
            return b((i) f8);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View b(i iVar) {
        if (!(iVar instanceof RecyclerView.F)) {
            return null;
        }
        View g8 = iVar.g();
        if (g8 != ((RecyclerView.F) iVar).f10944a) {
            return g8;
        }
        throw new IllegalStateException("Inconsistency detected! getSwipeableContainerView() returns itemView");
    }
}
