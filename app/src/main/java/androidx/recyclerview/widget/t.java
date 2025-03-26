package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import q.C6404h;
import q.C6407k;

/* loaded from: classes.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    final C6407k f11281a = new C6407k();

    /* renamed from: b, reason: collision with root package name */
    final C6404h f11282b = new C6404h();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static y0.f f11283d = new y0.g(20);

        /* renamed from: a, reason: collision with root package name */
        int f11284a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.m.b f11285b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.m.b f11286c;

        private a() {
        }

        static void a() {
            while (f11283d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f11283d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f11284a = 0;
            aVar.f11285b = null;
            aVar.f11286c = null;
            f11283d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.F f8);

        void b(RecyclerView.F f8, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void c(RecyclerView.F f8, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.F f8, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    t() {
    }

    private RecyclerView.m.b l(RecyclerView.F f8, int i8) {
        a aVar;
        RecyclerView.m.b bVar;
        int e8 = this.f11281a.e(f8);
        if (e8 >= 0 && (aVar = (a) this.f11281a.k(e8)) != null) {
            int i9 = aVar.f11284a;
            if ((i9 & i8) != 0) {
                int i10 = (~i8) & i9;
                aVar.f11284a = i10;
                if (i8 == 4) {
                    bVar = aVar.f11285b;
                } else {
                    if (i8 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f11286c;
                }
                if ((i10 & 12) == 0) {
                    this.f11281a.i(e8);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.F f8, RecyclerView.m.b bVar) {
        a aVar = (a) this.f11281a.get(f8);
        if (aVar == null) {
            aVar = a.b();
            this.f11281a.put(f8, aVar);
        }
        aVar.f11284a |= 2;
        aVar.f11285b = bVar;
    }

    void b(RecyclerView.F f8) {
        a aVar = (a) this.f11281a.get(f8);
        if (aVar == null) {
            aVar = a.b();
            this.f11281a.put(f8, aVar);
        }
        aVar.f11284a |= 1;
    }

    void c(long j8, RecyclerView.F f8) {
        this.f11282b.m(j8, f8);
    }

    void d(RecyclerView.F f8, RecyclerView.m.b bVar) {
        a aVar = (a) this.f11281a.get(f8);
        if (aVar == null) {
            aVar = a.b();
            this.f11281a.put(f8, aVar);
        }
        aVar.f11286c = bVar;
        aVar.f11284a |= 8;
    }

    void e(RecyclerView.F f8, RecyclerView.m.b bVar) {
        a aVar = (a) this.f11281a.get(f8);
        if (aVar == null) {
            aVar = a.b();
            this.f11281a.put(f8, aVar);
        }
        aVar.f11285b = bVar;
        aVar.f11284a |= 4;
    }

    void f() {
        this.f11281a.clear();
        this.f11282b.c();
    }

    RecyclerView.F g(long j8) {
        return (RecyclerView.F) this.f11282b.h(j8);
    }

    boolean h(RecyclerView.F f8) {
        a aVar = (a) this.f11281a.get(f8);
        return (aVar == null || (aVar.f11284a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.F f8) {
        a aVar = (a) this.f11281a.get(f8);
        return (aVar == null || (aVar.f11284a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.F f8) {
        p(f8);
    }

    RecyclerView.m.b m(RecyclerView.F f8) {
        return l(f8, 8);
    }

    RecyclerView.m.b n(RecyclerView.F f8) {
        return l(f8, 4);
    }

    void o(b bVar) {
        for (int size = this.f11281a.size() - 1; size >= 0; size--) {
            RecyclerView.F f8 = (RecyclerView.F) this.f11281a.g(size);
            a aVar = (a) this.f11281a.i(size);
            int i8 = aVar.f11284a;
            if ((i8 & 3) == 3) {
                bVar.a(f8);
            } else if ((i8 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f11285b;
                if (bVar2 == null) {
                    bVar.a(f8);
                } else {
                    bVar.c(f8, bVar2, aVar.f11286c);
                }
            } else if ((i8 & 14) == 14) {
                bVar.b(f8, aVar.f11285b, aVar.f11286c);
            } else if ((i8 & 12) == 12) {
                bVar.d(f8, aVar.f11285b, aVar.f11286c);
            } else if ((i8 & 4) != 0) {
                bVar.c(f8, aVar.f11285b, null);
            } else if ((i8 & 8) != 0) {
                bVar.b(f8, aVar.f11285b, aVar.f11286c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.F f8) {
        a aVar = (a) this.f11281a.get(f8);
        if (aVar == null) {
            return;
        }
        aVar.f11284a &= -2;
    }

    void q(RecyclerView.F f8) {
        int r8 = this.f11282b.r() - 1;
        while (true) {
            if (r8 < 0) {
                break;
            }
            if (f8 == this.f11282b.s(r8)) {
                this.f11282b.q(r8);
                break;
            }
            r8--;
        }
        a aVar = (a) this.f11281a.remove(f8);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
