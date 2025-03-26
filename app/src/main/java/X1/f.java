package x1;

import A1.p;
import android.content.Context;
import android.os.Build;
import s1.j;
import s1.k;
import w1.C6866b;

/* loaded from: classes.dex */
public class f extends AbstractC6900c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f44427e = j.f("NetworkNotRoamingCtrlr");

    public f(Context context, C1.a aVar) {
        super(y1.h.c(context, aVar).d());
    }

    @Override // x1.AbstractC6900c
    boolean b(p pVar) {
        return pVar.f104j.b() == k.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x1.AbstractC6900c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C6866b c6866b) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (c6866b.a() && c6866b.c()) ? false : true;
        }
        j.c().a(f44427e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !c6866b.a();
    }
}
