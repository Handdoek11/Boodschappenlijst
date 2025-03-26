package w1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.j;
import x1.AbstractC6900c;
import x1.C6898a;
import x1.C6899b;
import x1.C6901d;
import x1.e;
import x1.f;
import x1.g;
import x1.h;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6868d implements AbstractC6900c.a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f44241d = j.f("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6867c f44242a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6900c[] f44243b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f44244c;

    public C6868d(Context context, C1.a aVar, InterfaceC6867c interfaceC6867c) {
        Context applicationContext = context.getApplicationContext();
        this.f44242a = interfaceC6867c;
        this.f44243b = new AbstractC6900c[]{new C6898a(applicationContext, aVar), new C6899b(applicationContext, aVar), new h(applicationContext, aVar), new C6901d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f44244c = new Object();
    }

    @Override // x1.AbstractC6900c.a
    public void a(List list) {
        synchronized (this.f44244c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        j.c().a(f44241d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                InterfaceC6867c interfaceC6867c = this.f44242a;
                if (interfaceC6867c != null) {
                    interfaceC6867c.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x1.AbstractC6900c.a
    public void b(List list) {
        synchronized (this.f44244c) {
            try {
                InterfaceC6867c interfaceC6867c = this.f44242a;
                if (interfaceC6867c != null) {
                    interfaceC6867c.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f44244c) {
            try {
                for (AbstractC6900c abstractC6900c : this.f44243b) {
                    if (abstractC6900c.d(str)) {
                        j.c().a(f44241d, String.format("Work %s constrained by %s", str, abstractC6900c.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.f44244c) {
            try {
                for (AbstractC6900c abstractC6900c : this.f44243b) {
                    abstractC6900c.g(null);
                }
                for (AbstractC6900c abstractC6900c2 : this.f44243b) {
                    abstractC6900c2.e(iterable);
                }
                for (AbstractC6900c abstractC6900c3 : this.f44243b) {
                    abstractC6900c3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f44244c) {
            try {
                for (AbstractC6900c abstractC6900c : this.f44243b) {
                    abstractC6900c.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
