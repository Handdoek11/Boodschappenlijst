package x1;

import A1.p;
import android.content.Context;
import android.os.Build;
import s1.j;
import s1.k;
import w1.C6866b;

/* loaded from: classes.dex */
public class e extends AbstractC6900c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f44426e = j.f("NetworkMeteredCtrlr");

    public e(Context context, C1.a aVar) {
        super(y1.h.c(context, aVar).d());
    }

    @Override // x1.AbstractC6900c
    boolean b(p pVar) {
        return pVar.f104j.b() == k.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x1.AbstractC6900c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C6866b c6866b) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (c6866b.a() && c6866b.b()) ? false : true;
        }
        j.c().a(f44426e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c6866b.a();
    }
}
