package a4;

import a4.C0821e;
import a4.InterfaceC0818b;
import android.app.Activity;
import android.content.Context;
import j$.util.Objects;
import p3.AbstractC6328a;
import p3.AbstractC6364s0;
import p3.M;

/* renamed from: a4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0822f {

    /* renamed from: a4.f$a */
    public interface a {
        void a(C0821e c0821e);
    }

    /* renamed from: a4.f$b */
    public interface b {
        void b(InterfaceC0818b interfaceC0818b);
    }

    public static InterfaceC0819c a(Context context) {
        return AbstractC6328a.a(context).b();
    }

    public static void b(final Activity activity, final InterfaceC0818b.a aVar) {
        if (AbstractC6328a.a(activity).b().d()) {
            aVar.a(null);
            return;
        }
        M c8 = AbstractC6328a.a(activity).c();
        AbstractC6364s0.a();
        b bVar = new b() { // from class: p3.K
            @Override // a4.AbstractC0822f.b
            public final void b(InterfaceC0818b interfaceC0818b) {
                interfaceC0818b.a(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        c8.b(bVar, new a() { // from class: p3.L
            @Override // a4.AbstractC0822f.a
            public final void a(C0821e c0821e) {
                aVar.a(c0821e);
            }
        });
    }

    public static void c(Activity activity, InterfaceC0818b.a aVar) {
        AbstractC6328a.a(activity).c().e(activity, aVar);
    }
}
