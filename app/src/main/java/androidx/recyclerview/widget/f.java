package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f11164a = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f11167a - dVar2.f11167a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i8, int i9);

        public abstract boolean b(int i8, int i9);

        public Object c(int i8, int i9) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f11165a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11166b;

        c(int i8) {
            int[] iArr = new int[i8];
            this.f11165a = iArr;
            this.f11166b = iArr.length / 2;
        }

        int[] a() {
            return this.f11165a;
        }

        int b(int i8) {
            return this.f11165a[i8 + this.f11166b];
        }

        void c(int i8, int i9) {
            this.f11165a[i8 + this.f11166b] = i9;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f11167a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11168b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11169c;

        d(int i8, int i9, int i10) {
            this.f11167a = i8;
            this.f11168b = i9;
            this.f11169c = i10;
        }

        int a() {
            return this.f11167a + this.f11169c;
        }

        int b() {
            return this.f11168b + this.f11169c;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final List f11170a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f11171b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f11172c;

        /* renamed from: d, reason: collision with root package name */
        private final b f11173d;

        /* renamed from: e, reason: collision with root package name */
        private final int f11174e;

        /* renamed from: f, reason: collision with root package name */
        private final int f11175f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f11176g;

        e(b bVar, List list, int[] iArr, int[] iArr2, boolean z7) {
            this.f11170a = list;
            this.f11171b = iArr;
            this.f11172c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f11173d = bVar;
            this.f11174e = bVar.e();
            this.f11175f = bVar.d();
            this.f11176g = z7;
            a();
            e();
        }

        private void a() {
            d dVar = this.f11170a.isEmpty() ? null : (d) this.f11170a.get(0);
            if (dVar == null || dVar.f11167a != 0 || dVar.f11168b != 0) {
                this.f11170a.add(0, new d(0, 0, 0));
            }
            this.f11170a.add(new d(this.f11174e, this.f11175f, 0));
        }

        private void d(int i8) {
            int size = this.f11170a.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) this.f11170a.get(i10);
                while (i9 < dVar.f11168b) {
                    if (this.f11172c[i9] == 0 && this.f11173d.b(i8, i9)) {
                        int i11 = this.f11173d.a(i8, i9) ? 8 : 4;
                        this.f11171b[i8] = (i9 << 4) | i11;
                        this.f11172c[i9] = (i8 << 4) | i11;
                        return;
                    }
                    i9++;
                }
                i9 = dVar.b();
            }
        }

        private void e() {
            for (d dVar : this.f11170a) {
                for (int i8 = 0; i8 < dVar.f11169c; i8++) {
                    int i9 = dVar.f11167a + i8;
                    int i10 = dVar.f11168b + i8;
                    int i11 = this.f11173d.a(i9, i10) ? 1 : 2;
                    this.f11171b[i9] = (i10 << 4) | i11;
                    this.f11172c[i10] = (i9 << 4) | i11;
                }
            }
            if (this.f11176g) {
                f();
            }
        }

        private void f() {
            int i8 = 0;
            for (d dVar : this.f11170a) {
                while (i8 < dVar.f11167a) {
                    if (this.f11171b[i8] == 0) {
                        d(i8);
                    }
                    i8++;
                }
                i8 = dVar.a();
            }
        }

        private static C0183f g(Collection collection, int i8, boolean z7) {
            C0183f c0183f;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0183f = null;
                    break;
                }
                c0183f = (C0183f) it.next();
                if (c0183f.f11177a == i8 && c0183f.f11179c == z7) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C0183f c0183f2 = (C0183f) it.next();
                if (z7) {
                    c0183f2.f11178b--;
                } else {
                    c0183f2.f11178b++;
                }
            }
            return c0183f;
        }

        public void b(k kVar) {
            int i8;
            androidx.recyclerview.widget.c cVar = kVar instanceof androidx.recyclerview.widget.c ? (androidx.recyclerview.widget.c) kVar : new androidx.recyclerview.widget.c(kVar);
            int i9 = this.f11174e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = this.f11174e;
            int i11 = this.f11175f;
            for (int size = this.f11170a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f11170a.get(size);
                int a8 = dVar.a();
                int b8 = dVar.b();
                while (true) {
                    if (i10 <= a8) {
                        break;
                    }
                    i10--;
                    int i12 = this.f11171b[i10];
                    if ((i12 & 12) != 0) {
                        int i13 = i12 >> 4;
                        C0183f g8 = g(arrayDeque, i13, false);
                        if (g8 != null) {
                            int i14 = (i9 - g8.f11178b) - 1;
                            cVar.a(i10, i14);
                            if ((i12 & 4) != 0) {
                                cVar.d(i14, 1, this.f11173d.c(i10, i13));
                            }
                        } else {
                            arrayDeque.add(new C0183f(i10, (i9 - i10) - 1, true));
                        }
                    } else {
                        cVar.c(i10, 1);
                        i9--;
                    }
                }
                while (i11 > b8) {
                    i11--;
                    int i15 = this.f11172c[i11];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        C0183f g9 = g(arrayDeque, i16, true);
                        if (g9 == null) {
                            arrayDeque.add(new C0183f(i11, i9 - i10, false));
                        } else {
                            cVar.a((i9 - g9.f11178b) - 1, i10);
                            if ((i15 & 4) != 0) {
                                cVar.d(i10, 1, this.f11173d.c(i16, i11));
                            }
                        }
                    } else {
                        cVar.b(i10, 1);
                        i9++;
                    }
                }
                int i17 = dVar.f11167a;
                int i18 = dVar.f11168b;
                for (i8 = 0; i8 < dVar.f11169c; i8++) {
                    if ((this.f11171b[i17] & 15) == 2) {
                        cVar.d(i17, 1, this.f11173d.c(i17, i18));
                    }
                    i17++;
                    i18++;
                }
                i10 = dVar.f11167a;
                i11 = dVar.f11168b;
            }
            cVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    private static class C0183f {

        /* renamed from: a, reason: collision with root package name */
        int f11177a;

        /* renamed from: b, reason: collision with root package name */
        int f11178b;

        /* renamed from: c, reason: collision with root package name */
        boolean f11179c;

        C0183f(int i8, int i9, boolean z7) {
            this.f11177a = i8;
            this.f11178b = i9;
            this.f11179c = z7;
        }
    }

    static class g {

        /* renamed from: a, reason: collision with root package name */
        int f11180a;

        /* renamed from: b, reason: collision with root package name */
        int f11181b;

        /* renamed from: c, reason: collision with root package name */
        int f11182c;

        /* renamed from: d, reason: collision with root package name */
        int f11183d;

        public g() {
        }

        int a() {
            return this.f11183d - this.f11182c;
        }

        int b() {
            return this.f11181b - this.f11180a;
        }

        public g(int i8, int i9, int i10, int i11) {
            this.f11180a = i8;
            this.f11181b = i9;
            this.f11182c = i10;
            this.f11183d = i11;
        }
    }

    static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f11184a;

        /* renamed from: b, reason: collision with root package name */
        public int f11185b;

        /* renamed from: c, reason: collision with root package name */
        public int f11186c;

        /* renamed from: d, reason: collision with root package name */
        public int f11187d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11188e;

        h() {
        }

        int a() {
            return Math.min(this.f11186c - this.f11184a, this.f11187d - this.f11185b);
        }

        boolean b() {
            return this.f11187d - this.f11185b != this.f11186c - this.f11184a;
        }

        boolean c() {
            return this.f11187d - this.f11185b > this.f11186c - this.f11184a;
        }

        d d() {
            if (b()) {
                return this.f11188e ? new d(this.f11184a, this.f11185b, a()) : c() ? new d(this.f11184a, this.f11185b + 1, a()) : new d(this.f11184a + 1, this.f11185b, a());
            }
            int i8 = this.f11184a;
            return new d(i8, this.f11185b, this.f11186c - i8);
        }
    }

    private static h a(g gVar, b bVar, c cVar, c cVar2, int i8) {
        int b8;
        int i9;
        int i10;
        boolean z7 = (gVar.b() - gVar.a()) % 2 == 0;
        int b9 = gVar.b() - gVar.a();
        int i11 = -i8;
        for (int i12 = i11; i12 <= i8; i12 += 2) {
            if (i12 == i11 || (i12 != i8 && cVar2.b(i12 + 1) < cVar2.b(i12 - 1))) {
                b8 = cVar2.b(i12 + 1);
                i9 = b8;
            } else {
                b8 = cVar2.b(i12 - 1);
                i9 = b8 - 1;
            }
            int i13 = gVar.f11183d - ((gVar.f11181b - i9) - i12);
            int i14 = (i8 == 0 || i9 != b8) ? i13 : i13 + 1;
            while (i9 > gVar.f11180a && i13 > gVar.f11182c && bVar.b(i9 - 1, i13 - 1)) {
                i9--;
                i13--;
            }
            cVar2.c(i12, i9);
            if (z7 && (i10 = b9 - i12) >= i11 && i10 <= i8 && cVar.b(i10) >= i9) {
                h hVar = new h();
                hVar.f11184a = i9;
                hVar.f11185b = i13;
                hVar.f11186c = b8;
                hVar.f11187d = i14;
                hVar.f11188e = true;
                return hVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z7) {
        int e8 = bVar.e();
        int d8 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new g(0, e8, 0, d8));
        int i8 = ((((e8 + d8) + 1) / 2) * 2) + 1;
        c cVar = new c(i8);
        c cVar2 = new c(i8);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar = (g) arrayList2.remove(arrayList2.size() - 1);
            h e9 = e(gVar, bVar, cVar, cVar2);
            if (e9 != null) {
                if (e9.a() > 0) {
                    arrayList.add(e9.d());
                }
                g gVar2 = arrayList3.isEmpty() ? new g() : (g) arrayList3.remove(arrayList3.size() - 1);
                gVar2.f11180a = gVar.f11180a;
                gVar2.f11182c = gVar.f11182c;
                gVar2.f11181b = e9.f11184a;
                gVar2.f11183d = e9.f11185b;
                arrayList2.add(gVar2);
                gVar.f11181b = gVar.f11181b;
                gVar.f11183d = gVar.f11183d;
                gVar.f11180a = e9.f11186c;
                gVar.f11182c = e9.f11187d;
                arrayList2.add(gVar);
            } else {
                arrayList3.add(gVar);
            }
        }
        Collections.sort(arrayList, f11164a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z7);
    }

    private static h d(g gVar, b bVar, c cVar, c cVar2, int i8) {
        int b8;
        int i9;
        int i10;
        boolean z7 = Math.abs(gVar.b() - gVar.a()) % 2 == 1;
        int b9 = gVar.b() - gVar.a();
        int i11 = -i8;
        for (int i12 = i11; i12 <= i8; i12 += 2) {
            if (i12 == i11 || (i12 != i8 && cVar.b(i12 + 1) > cVar.b(i12 - 1))) {
                b8 = cVar.b(i12 + 1);
                i9 = b8;
            } else {
                b8 = cVar.b(i12 - 1);
                i9 = b8 + 1;
            }
            int i13 = (gVar.f11182c + (i9 - gVar.f11180a)) - i12;
            int i14 = (i8 == 0 || i9 != b8) ? i13 : i13 - 1;
            while (i9 < gVar.f11181b && i13 < gVar.f11183d && bVar.b(i9, i13)) {
                i9++;
                i13++;
            }
            cVar.c(i12, i9);
            if (z7 && (i10 = b9 - i12) >= i11 + 1 && i10 <= i8 - 1 && cVar2.b(i10) <= i9) {
                h hVar = new h();
                hVar.f11184a = b8;
                hVar.f11185b = i14;
                hVar.f11186c = i9;
                hVar.f11187d = i13;
                hVar.f11188e = false;
                return hVar;
            }
        }
        return null;
    }

    private static h e(g gVar, b bVar, c cVar, c cVar2) {
        if (gVar.b() >= 1 && gVar.a() >= 1) {
            int b8 = ((gVar.b() + gVar.a()) + 1) / 2;
            cVar.c(1, gVar.f11180a);
            cVar2.c(1, gVar.f11181b);
            for (int i8 = 0; i8 < b8; i8++) {
                h d8 = d(gVar, bVar, cVar, cVar2, i8);
                if (d8 != null) {
                    return d8;
                }
                h a8 = a(gVar, bVar, cVar, cVar2, i8);
                if (a8 != null) {
                    return a8;
                }
            }
        }
        return null;
    }
}
