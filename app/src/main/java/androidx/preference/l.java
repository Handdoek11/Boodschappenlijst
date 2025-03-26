package androidx.preference;

import A0.z;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import z0.C7013a;

/* loaded from: classes.dex */
public class l extends androidx.recyclerview.widget.o {

    /* renamed from: w, reason: collision with root package name */
    final RecyclerView f10539w;

    /* renamed from: x, reason: collision with root package name */
    final C7013a f10540x;

    /* renamed from: y, reason: collision with root package name */
    final C7013a f10541y;

    class a extends C7013a {
        a() {
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            Preference g02;
            l.this.f10540x.k(view, zVar);
            int k02 = l.this.f10539w.k0(view);
            RecyclerView.h adapter = l.this.f10539w.getAdapter();
            if ((adapter instanceof i) && (g02 = ((i) adapter).g0(k02)) != null) {
                g02.a0(zVar);
            }
        }

        @Override // z0.C7013a
        public boolean n(View view, int i8, Bundle bundle) {
            return l.this.f10540x.n(view, i8, bundle);
        }
    }

    public l(RecyclerView recyclerView) {
        super(recyclerView);
        this.f10540x = super.r();
        this.f10541y = new a();
        this.f10539w = recyclerView;
    }

    @Override // androidx.recyclerview.widget.o
    public C7013a r() {
        return this.f10541y;
    }
}
