package P4;

import android.content.Context;
import g4.C5807c;
import g4.r;

/* loaded from: classes2.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C5807c b(String str, String str2) {
        return C5807c.l(f.a(str, str2), f.class);
    }

    public static C5807c c(final String str, final a aVar) {
        return C5807c.m(f.class).b(r.l(Context.class)).f(new g4.h() { // from class: P4.g
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return h.d(str, aVar, eVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, g4.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
