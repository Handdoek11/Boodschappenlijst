package D2;

import com.google.android.gms.internal.ads.AbstractBinderC1664Pj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: D2.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC0522m1 extends AbstractBinderC1664Pj {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C0528o1 f1313o;

    /* synthetic */ BinderC0522m1(C0528o1 c0528o1, AbstractC0525n1 abstractC0525n1) {
        this.f1313o = c0528o1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1699Qj
    public final void u5(List list) {
        int i8;
        ArrayList arrayList;
        synchronized (this.f1313o.f1325a) {
            this.f1313o.f1328d = false;
            this.f1313o.f1329e = true;
            arrayList = new ArrayList(this.f1313o.f1327c);
            this.f1313o.f1327c.clear();
        }
        B2.b a8 = C0528o1.a(list);
        int size = arrayList.size();
        for (i8 = 0; i8 < size; i8++) {
            ((B2.c) arrayList.get(i8)).a(a8);
        }
    }
}
