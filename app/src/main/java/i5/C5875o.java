package i5;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: i5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5875o extends AbstractC5862b {
    public C5875o(RecyclerView recyclerView) {
        super(recyclerView);
    }

    @Override // i5.AbstractC5862b
    protected int o(int i8) {
        if (i8 == 0) {
            return 1;
        }
        if (i8 == 1) {
            return 3;
        }
        throw new IllegalArgumentException();
    }
}
