package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class d {

    /* renamed from: e, reason: collision with root package name */
    private static d f32266e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f32267a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f32268b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private c f32269c;

    /* renamed from: d, reason: collision with root package name */
    private c f32270d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d.this.d((c) message.obj);
            return true;
        }
    }

    interface b {
        void b();

        void c(int i8);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference f32272a;

        /* renamed from: b, reason: collision with root package name */
        int f32273b;

        /* renamed from: c, reason: collision with root package name */
        boolean f32274c;

        c(int i8, b bVar) {
            this.f32272a = new WeakReference(bVar);
            this.f32273b = i8;
        }

        boolean a(b bVar) {
            return bVar != null && this.f32272a.get() == bVar;
        }
    }

    private d() {
    }

    private boolean a(c cVar, int i8) {
        b bVar = (b) cVar.f32272a.get();
        if (bVar == null) {
            return false;
        }
        this.f32268b.removeCallbacksAndMessages(cVar);
        bVar.c(i8);
        return true;
    }

    static d c() {
        if (f32266e == null) {
            f32266e = new d();
        }
        return f32266e;
    }

    private boolean f(b bVar) {
        c cVar = this.f32269c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(b bVar) {
        c cVar = this.f32270d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i8 = cVar.f32273b;
        if (i8 == -2) {
            return;
        }
        if (i8 <= 0) {
            i8 = i8 == -1 ? 1500 : 2750;
        }
        this.f32268b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f32268b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i8);
    }

    private void n() {
        c cVar = this.f32270d;
        if (cVar != null) {
            this.f32269c = cVar;
            this.f32270d = null;
            b bVar = (b) cVar.f32272a.get();
            if (bVar != null) {
                bVar.b();
            } else {
                this.f32269c = null;
            }
        }
    }

    public void b(b bVar, int i8) {
        synchronized (this.f32267a) {
            try {
                if (f(bVar)) {
                    a(this.f32269c, i8);
                } else if (g(bVar)) {
                    a(this.f32270d, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f32267a) {
            try {
                if (this.f32269c == cVar || this.f32270d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z7;
        synchronized (this.f32267a) {
            try {
                z7 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z7;
    }

    public void h(b bVar) {
        synchronized (this.f32267a) {
            try {
                if (f(bVar)) {
                    this.f32269c = null;
                    if (this.f32270d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f32267a) {
            try {
                if (f(bVar)) {
                    l(this.f32269c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f32267a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f32269c;
                    if (!cVar.f32274c) {
                        cVar.f32274c = true;
                        this.f32268b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f32267a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f32269c;
                    if (cVar.f32274c) {
                        cVar.f32274c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i8, b bVar) {
        synchronized (this.f32267a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f32269c;
                    cVar.f32273b = i8;
                    this.f32268b.removeCallbacksAndMessages(cVar);
                    l(this.f32269c);
                    return;
                }
                if (g(bVar)) {
                    this.f32270d.f32273b = i8;
                } else {
                    this.f32270d = new c(i8, bVar);
                }
                c cVar2 = this.f32269c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f32269c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
