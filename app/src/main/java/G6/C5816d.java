package g6;

import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import h6.AbstractC5844b;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import r6.AbstractC6714f;

/* renamed from: g6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5816d implements InterfaceC5732b, InterfaceC5813a {

    /* renamed from: o, reason: collision with root package name */
    List f36099o;

    /* renamed from: s, reason: collision with root package name */
    volatile boolean f36100s;

    @Override // g6.InterfaceC5813a
    public boolean a(InterfaceC5732b interfaceC5732b) {
        if (!d(interfaceC5732b)) {
            return false;
        }
        interfaceC5732b.c();
        return true;
    }

    @Override // g6.InterfaceC5813a
    public boolean b(InterfaceC5732b interfaceC5732b) {
        AbstractC5844b.e(interfaceC5732b, "d is null");
        if (!this.f36100s) {
            synchronized (this) {
                try {
                    if (!this.f36100s) {
                        List list = this.f36099o;
                        if (list == null) {
                            list = new LinkedList();
                            this.f36099o = list;
                        }
                        list.add(interfaceC5732b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC5732b.c();
        return false;
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        if (this.f36100s) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f36100s) {
                    return;
                }
                this.f36100s = true;
                List list = this.f36099o;
                this.f36099o = null;
                e(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g6.InterfaceC5813a
    public boolean d(InterfaceC5732b interfaceC5732b) {
        AbstractC5844b.e(interfaceC5732b, "Disposable item is null");
        if (this.f36100s) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f36100s) {
                    return false;
                }
                List list = this.f36099o;
                if (list != null && list.remove(interfaceC5732b)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    void e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC5732b) it.next()).c();
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw AbstractC6714f.c((Throwable) arrayList.get(0));
        }
    }
}
