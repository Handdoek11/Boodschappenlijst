package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import g.AbstractC5794a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.X;

/* loaded from: classes.dex */
public class i extends RecyclerView.h implements Preference.c {

    /* renamed from: d, reason: collision with root package name */
    private final PreferenceGroup f10507d;

    /* renamed from: e, reason: collision with root package name */
    private List f10508e;

    /* renamed from: f, reason: collision with root package name */
    private List f10509f;

    /* renamed from: g, reason: collision with root package name */
    private final List f10510g;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f10512i = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f10511h = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.k0();
        }
    }

    class b implements Preference.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f10514a;

        b(PreferenceGroup preferenceGroup) {
            this.f10514a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference) {
            this.f10514a.T0(Integer.MAX_VALUE);
            i.this.c(preference);
            this.f10514a.O0();
            return true;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        int f10516a;

        /* renamed from: b, reason: collision with root package name */
        int f10517b;

        /* renamed from: c, reason: collision with root package name */
        String f10518c;

        c(Preference preference) {
            this.f10518c = preference.getClass().getName();
            this.f10516a = preference.v();
            this.f10517b = preference.I();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10516a == cVar.f10516a && this.f10517b == cVar.f10517b && TextUtils.equals(this.f10518c, cVar.f10518c);
        }

        public int hashCode() {
            return ((((527 + this.f10516a) * 31) + this.f10517b) * 31) + this.f10518c.hashCode();
        }
    }

    public i(PreferenceGroup preferenceGroup) {
        this.f10507d = preferenceGroup;
        preferenceGroup.w0(this);
        this.f10508e = new ArrayList();
        this.f10509f = new ArrayList();
        this.f10510g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            b0(((PreferenceScreen) preferenceGroup).W0());
        } else {
            b0(true);
        }
        k0();
    }

    private androidx.preference.b d0(PreferenceGroup preferenceGroup, List list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.m(), list, preferenceGroup.s());
        bVar.x0(new b(preferenceGroup));
        return bVar;
    }

    private List e0(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int Q02 = preferenceGroup.Q0();
        int i8 = 0;
        for (int i9 = 0; i9 < Q02; i9++) {
            Preference P02 = preferenceGroup.P0(i9);
            if (P02.O()) {
                if (!h0(preferenceGroup) || i8 < preferenceGroup.N0()) {
                    arrayList.add(P02);
                } else {
                    arrayList2.add(P02);
                }
                if (P02 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) P02;
                    if (!preferenceGroup2.R0()) {
                        continue;
                    } else {
                        if (h0(preferenceGroup) && h0(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : e0(preferenceGroup2)) {
                            if (!h0(preferenceGroup) || i8 < preferenceGroup.N0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i8++;
                        }
                    }
                } else {
                    i8++;
                }
            }
        }
        if (h0(preferenceGroup) && i8 > preferenceGroup.N0()) {
            arrayList.add(d0(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void f0(List list, PreferenceGroup preferenceGroup) {
        preferenceGroup.V0();
        int Q02 = preferenceGroup.Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            Preference P02 = preferenceGroup.P0(i8);
            list.add(P02);
            c cVar = new c(P02);
            if (!this.f10510g.contains(cVar)) {
                this.f10510g.add(cVar);
            }
            if (P02 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) P02;
                if (preferenceGroup2.R0()) {
                    f0(list, preferenceGroup2);
                }
            }
            P02.w0(this);
        }
    }

    private boolean h0(PreferenceGroup preferenceGroup) {
        return preferenceGroup.N0() != Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int E() {
        return this.f10509f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long F(int i8) {
        if (I()) {
            return g0(i8).s();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int G(int i8) {
        c cVar = new c(g0(i8));
        int indexOf = this.f10510g.indexOf(cVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f10510g.size();
        this.f10510g.add(cVar);
        return size;
    }

    @Override // androidx.preference.Preference.c
    public void c(Preference preference) {
        this.f10511h.removeCallbacks(this.f10512i);
        this.f10511h.post(this.f10512i);
    }

    public Preference g0(int i8) {
        if (i8 < 0 || i8 >= E()) {
            return null;
        }
        return (Preference) this.f10509f.get(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void S(m mVar, int i8) {
        Preference g02 = g0(i8);
        mVar.j0();
        g02.V(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public m U(ViewGroup viewGroup, int i8) {
        c cVar = (c) this.f10510g.get(i8);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, t.f10629a);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.f10632b);
        if (drawable == null) {
            drawable = AbstractC5794a.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(cVar.f10516a, viewGroup, false);
        if (inflate.getBackground() == null) {
            X.r0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i9 = cVar.f10517b;
            if (i9 != 0) {
                from.inflate(i9, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new m(inflate);
    }

    void k0() {
        Iterator it = this.f10508e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).w0(null);
        }
        ArrayList arrayList = new ArrayList(this.f10508e.size());
        this.f10508e = arrayList;
        f0(arrayList, this.f10507d);
        this.f10509f = e0(this.f10507d);
        k D7 = this.f10507d.D();
        if (D7 != null) {
            D7.i();
        }
        J();
        Iterator it2 = this.f10508e.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).f();
        }
    }

    @Override // androidx.preference.Preference.c
    public void l(Preference preference) {
        c(preference);
    }

    @Override // androidx.preference.Preference.c
    public void u(Preference preference) {
        int indexOf = this.f10509f.indexOf(preference);
        if (indexOf != -1) {
            L(indexOf, preference);
        }
    }
}
