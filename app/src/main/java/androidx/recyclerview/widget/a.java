package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class a implements l.a {

    /* renamed from: a, reason: collision with root package name */
    private y0.f f11088a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f11089b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f11090c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0181a f11091d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f11092e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f11093f;

    /* renamed from: g, reason: collision with root package name */
    final l f11094g;

    /* renamed from: h, reason: collision with root package name */
    private int f11095h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0181a {
        void a(int i8, int i9);

        void b(b bVar);

        void c(int i8, int i9, Object obj);

        void d(b bVar);

        RecyclerView.F e(int i8);

        void f(int i8, int i9);

        void g(int i8, int i9);

        void h(int i8, int i9);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f11096a;

        /* renamed from: b, reason: collision with root package name */
        int f11097b;

        /* renamed from: c, reason: collision with root package name */
        Object f11098c;

        /* renamed from: d, reason: collision with root package name */
        int f11099d;

        b(int i8, int i9, int i10, Object obj) {
            this.f11096a = i8;
            this.f11097b = i9;
            this.f11099d = i10;
            this.f11098c = obj;
        }

        String a() {
            int i8 = this.f11096a;
            return i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i8 = this.f11096a;
            if (i8 != bVar.f11096a) {
                return false;
            }
            if (i8 == 8 && Math.abs(this.f11099d - this.f11097b) == 1 && this.f11099d == bVar.f11097b && this.f11097b == bVar.f11099d) {
                return true;
            }
            if (this.f11099d != bVar.f11099d || this.f11097b != bVar.f11097b) {
                return false;
            }
            Object obj2 = this.f11098c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f11098c)) {
                    return false;
                }
            } else if (bVar.f11098c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f11096a * 31) + this.f11097b) * 31) + this.f11099d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f11097b + "c:" + this.f11099d + ",p:" + this.f11098c + "]";
        }
    }

    a(InterfaceC0181a interfaceC0181a) {
        this(interfaceC0181a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z7;
        char c8;
        int i8 = bVar.f11097b;
        int i9 = bVar.f11099d + i8;
        char c9 = 65535;
        int i10 = i8;
        int i11 = 0;
        while (i10 < i9) {
            if (this.f11091d.e(i10) != null || h(i10)) {
                if (c9 == 0) {
                    k(b(2, i8, i11, null));
                    z7 = true;
                } else {
                    z7 = false;
                }
                c8 = 1;
            } else {
                if (c9 == 1) {
                    v(b(2, i8, i11, null));
                    z7 = true;
                } else {
                    z7 = false;
                }
                c8 = 0;
            }
            if (z7) {
                i10 -= i11;
                i9 -= i11;
                i11 = 1;
            } else {
                i11++;
            }
            i10++;
            c9 = c8;
        }
        if (i11 != bVar.f11099d) {
            a(bVar);
            bVar = b(2, i8, i11, null);
        }
        if (c9 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i8 = bVar.f11097b;
        int i9 = bVar.f11099d + i8;
        int i10 = 0;
        boolean z7 = -1;
        int i11 = i8;
        while (i8 < i9) {
            if (this.f11091d.e(i8) != null || h(i8)) {
                if (!z7) {
                    k(b(4, i11, i10, bVar.f11098c));
                    i11 = i8;
                    i10 = 0;
                }
                z7 = true;
            } else {
                if (z7) {
                    v(b(4, i11, i10, bVar.f11098c));
                    i11 = i8;
                    i10 = 0;
                }
                z7 = false;
            }
            i10++;
            i8++;
        }
        if (i10 != bVar.f11099d) {
            Object obj = bVar.f11098c;
            a(bVar);
            bVar = b(4, i11, i10, obj);
        }
        if (z7) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i8) {
        int size = this.f11090c.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) this.f11090c.get(i9);
            int i10 = bVar.f11096a;
            if (i10 == 8) {
                if (n(bVar.f11099d, i9 + 1) == i8) {
                    return true;
                }
            } else if (i10 == 1) {
                int i11 = bVar.f11097b;
                int i12 = bVar.f11099d + i11;
                while (i11 < i12) {
                    if (n(i11, i9 + 1) == i8) {
                        return true;
                    }
                    i11++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i8;
        int i9 = bVar.f11096a;
        if (i9 == 1 || i9 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z7 = z(bVar.f11097b, i9);
        int i10 = bVar.f11097b;
        int i11 = bVar.f11096a;
        if (i11 == 2) {
            i8 = 0;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i8 = 1;
        }
        int i12 = 1;
        for (int i13 = 1; i13 < bVar.f11099d; i13++) {
            int z8 = z(bVar.f11097b + (i8 * i13), bVar.f11096a);
            int i14 = bVar.f11096a;
            if (i14 == 2 ? z8 != z7 : !(i14 == 4 && z8 == z7 + 1)) {
                b b8 = b(i14, z7, i12, bVar.f11098c);
                l(b8, i10);
                a(b8);
                if (bVar.f11096a == 4) {
                    i10 += i12;
                }
                i12 = 1;
                z7 = z8;
            } else {
                i12++;
            }
        }
        Object obj = bVar.f11098c;
        a(bVar);
        if (i12 > 0) {
            b b9 = b(bVar.f11096a, z7, i12, obj);
            l(b9, i10);
            a(b9);
        }
    }

    private void v(b bVar) {
        this.f11090c.add(bVar);
        int i8 = bVar.f11096a;
        if (i8 == 1) {
            this.f11091d.g(bVar.f11097b, bVar.f11099d);
            return;
        }
        if (i8 == 2) {
            this.f11091d.f(bVar.f11097b, bVar.f11099d);
            return;
        }
        if (i8 == 4) {
            this.f11091d.c(bVar.f11097b, bVar.f11099d, bVar.f11098c);
        } else {
            if (i8 == 8) {
                this.f11091d.a(bVar.f11097b, bVar.f11099d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i8, int i9) {
        int i10;
        int i11;
        for (int size = this.f11090c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f11090c.get(size);
            int i12 = bVar.f11096a;
            if (i12 == 8) {
                int i13 = bVar.f11097b;
                int i14 = bVar.f11099d;
                if (i13 < i14) {
                    i11 = i13;
                    i10 = i14;
                } else {
                    i10 = i13;
                    i11 = i14;
                }
                if (i8 < i11 || i8 > i10) {
                    if (i8 < i13) {
                        if (i9 == 1) {
                            bVar.f11097b = i13 + 1;
                            bVar.f11099d = i14 + 1;
                        } else if (i9 == 2) {
                            bVar.f11097b = i13 - 1;
                            bVar.f11099d = i14 - 1;
                        }
                    }
                } else if (i11 == i13) {
                    if (i9 == 1) {
                        bVar.f11099d = i14 + 1;
                    } else if (i9 == 2) {
                        bVar.f11099d = i14 - 1;
                    }
                    i8++;
                } else {
                    if (i9 == 1) {
                        bVar.f11097b = i13 + 1;
                    } else if (i9 == 2) {
                        bVar.f11097b = i13 - 1;
                    }
                    i8--;
                }
            } else {
                int i15 = bVar.f11097b;
                if (i15 <= i8) {
                    if (i12 == 1) {
                        i8 -= bVar.f11099d;
                    } else if (i12 == 2) {
                        i8 += bVar.f11099d;
                    }
                } else if (i9 == 1) {
                    bVar.f11097b = i15 + 1;
                } else if (i9 == 2) {
                    bVar.f11097b = i15 - 1;
                }
            }
        }
        for (int size2 = this.f11090c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f11090c.get(size2);
            if (bVar2.f11096a == 8) {
                int i16 = bVar2.f11099d;
                if (i16 == bVar2.f11097b || i16 < 0) {
                    this.f11090c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f11099d <= 0) {
                this.f11090c.remove(size2);
                a(bVar2);
            }
        }
        return i8;
    }

    @Override // androidx.recyclerview.widget.l.a
    public void a(b bVar) {
        if (this.f11093f) {
            return;
        }
        bVar.f11098c = null;
        this.f11088a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.l.a
    public b b(int i8, int i9, int i10, Object obj) {
        b bVar = (b) this.f11088a.b();
        if (bVar == null) {
            return new b(i8, i9, i10, obj);
        }
        bVar.f11096a = i8;
        bVar.f11097b = i9;
        bVar.f11099d = i10;
        bVar.f11098c = obj;
        return bVar;
    }

    public int e(int i8) {
        int size = this.f11089b.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) this.f11089b.get(i9);
            int i10 = bVar.f11096a;
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = bVar.f11097b;
                    if (i11 <= i8) {
                        int i12 = bVar.f11099d;
                        if (i11 + i12 > i8) {
                            return -1;
                        }
                        i8 -= i12;
                    } else {
                        continue;
                    }
                } else if (i10 == 8) {
                    int i13 = bVar.f11097b;
                    if (i13 == i8) {
                        i8 = bVar.f11099d;
                    } else {
                        if (i13 < i8) {
                            i8--;
                        }
                        if (bVar.f11099d <= i8) {
                            i8++;
                        }
                    }
                }
            } else if (bVar.f11097b <= i8) {
                i8 += bVar.f11099d;
            }
        }
        return i8;
    }

    void i() {
        int size = this.f11090c.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f11091d.d((b) this.f11090c.get(i8));
        }
        x(this.f11090c);
        this.f11095h = 0;
    }

    void j() {
        i();
        int size = this.f11089b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f11089b.get(i8);
            int i9 = bVar.f11096a;
            if (i9 == 1) {
                this.f11091d.d(bVar);
                this.f11091d.g(bVar.f11097b, bVar.f11099d);
            } else if (i9 == 2) {
                this.f11091d.d(bVar);
                this.f11091d.h(bVar.f11097b, bVar.f11099d);
            } else if (i9 == 4) {
                this.f11091d.d(bVar);
                this.f11091d.c(bVar.f11097b, bVar.f11099d, bVar.f11098c);
            } else if (i9 == 8) {
                this.f11091d.d(bVar);
                this.f11091d.a(bVar.f11097b, bVar.f11099d);
            }
            Runnable runnable = this.f11092e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f11089b);
        this.f11095h = 0;
    }

    void l(b bVar, int i8) {
        this.f11091d.b(bVar);
        int i9 = bVar.f11096a;
        if (i9 == 2) {
            this.f11091d.h(i8, bVar.f11099d);
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f11091d.c(i8, bVar.f11099d, bVar.f11098c);
        }
    }

    int m(int i8) {
        return n(i8, 0);
    }

    int n(int i8, int i9) {
        int size = this.f11090c.size();
        while (i9 < size) {
            b bVar = (b) this.f11090c.get(i9);
            int i10 = bVar.f11096a;
            if (i10 == 8) {
                int i11 = bVar.f11097b;
                if (i11 == i8) {
                    i8 = bVar.f11099d;
                } else {
                    if (i11 < i8) {
                        i8--;
                    }
                    if (bVar.f11099d <= i8) {
                        i8++;
                    }
                }
            } else {
                int i12 = bVar.f11097b;
                if (i12 > i8) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = bVar.f11099d;
                    if (i8 < i12 + i13) {
                        return -1;
                    }
                    i8 -= i13;
                } else if (i10 == 1) {
                    i8 += bVar.f11099d;
                }
            }
            i9++;
        }
        return i8;
    }

    boolean o(int i8) {
        return (i8 & this.f11095h) != 0;
    }

    boolean p() {
        return this.f11089b.size() > 0;
    }

    boolean q() {
        return (this.f11090c.isEmpty() || this.f11089b.isEmpty()) ? false : true;
    }

    boolean r(int i8, int i9, Object obj) {
        if (i9 < 1) {
            return false;
        }
        this.f11089b.add(b(4, i8, i9, obj));
        this.f11095h |= 4;
        return this.f11089b.size() == 1;
    }

    boolean s(int i8, int i9) {
        if (i9 < 1) {
            return false;
        }
        this.f11089b.add(b(1, i8, i9, null));
        this.f11095h |= 1;
        return this.f11089b.size() == 1;
    }

    boolean t(int i8, int i9, int i10) {
        if (i8 == i9) {
            return false;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f11089b.add(b(8, i8, i9, null));
        this.f11095h |= 8;
        return this.f11089b.size() == 1;
    }

    boolean u(int i8, int i9) {
        if (i9 < 1) {
            return false;
        }
        this.f11089b.add(b(2, i8, i9, null));
        this.f11095h |= 2;
        return this.f11089b.size() == 1;
    }

    void w() {
        this.f11094g.b(this.f11089b);
        int size = this.f11089b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f11089b.get(i8);
            int i9 = bVar.f11096a;
            if (i9 == 1) {
                c(bVar);
            } else if (i9 == 2) {
                f(bVar);
            } else if (i9 == 4) {
                g(bVar);
            } else if (i9 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f11092e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f11089b.clear();
    }

    void x(List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            a((b) list.get(i8));
        }
        list.clear();
    }

    void y() {
        x(this.f11089b);
        x(this.f11090c);
        this.f11095h = 0;
    }

    a(InterfaceC0181a interfaceC0181a, boolean z7) {
        this.f11088a = new y0.g(30);
        this.f11089b = new ArrayList();
        this.f11090c = new ArrayList();
        this.f11095h = 0;
        this.f11091d = interfaceC0181a;
        this.f11093f = z7;
        this.f11094g = new l(this);
    }
}
