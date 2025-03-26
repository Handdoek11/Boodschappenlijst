package x1;

import A1.p;
import android.content.Context;
import android.os.Build;
import s1.k;
import w1.C6866b;

/* loaded from: classes.dex */
public class g extends AbstractC6900c {
    public g(Context context, C1.a aVar) {
        super(y1.h.c(context, aVar).d());
    }

    @Override // x1.AbstractC6900c
    boolean b(p pVar) {
        return pVar.f104j.b() == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f104j.b() == k.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x1.AbstractC6900c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C6866b c6866b) {
        return !c6866b.a() || c6866b.b();
    }
}
