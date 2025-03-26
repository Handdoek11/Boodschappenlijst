package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t0.AbstractC6779a;

/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f31633a;

    /* renamed from: b, reason: collision with root package name */
    private final List f31634b;

    /* renamed from: c, reason: collision with root package name */
    private final List f31635c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f31636d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f31637e;

    /* renamed from: f, reason: collision with root package name */
    private final float f31638f;

    /* renamed from: g, reason: collision with root package name */
    private final float f31639g;

    private g(f fVar, List list, List list2) {
        this.f31633a = fVar;
        this.f31634b = DesugarCollections.unmodifiableList(list);
        this.f31635c = DesugarCollections.unmodifiableList(list2);
        float f8 = ((f) list.get(list.size() - 1)).c().f31625a - fVar.c().f31625a;
        this.f31638f = f8;
        float f9 = fVar.j().f31625a - ((f) list2.get(list2.size() - 1)).j().f31625a;
        this.f31639g = f9;
        this.f31636d = m(f8, list, true);
        this.f31637e = m(f9, list2, false);
    }

    private f a(List list, float f8, float[] fArr) {
        float[] o8 = o(list, f8, fArr);
        return o8[0] >= 0.5f ? (f) list.get((int) o8[2]) : (f) list.get((int) o8[1]);
    }

    private static int b(f fVar, float f8) {
        for (int i8 = fVar.i(); i8 < fVar.g().size(); i8++) {
            if (f8 == ((f.c) fVar.g().get(i8)).f31627c) {
                return i8;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i8 = 0; i8 < fVar.g().size(); i8++) {
            if (!((f.c) fVar.g().get(i8)).f31629e) {
                return i8;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f8) {
        for (int b8 = fVar.b() - 1; b8 >= 0; b8--) {
            if (f8 == ((f.c) fVar.g().get(b8)).f31627c) {
                return b8;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!((f.c) fVar.g().get(size)).f31629e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f8, float f9, float f10) {
        return new g(fVar, p(bVar, fVar, f8, f9), n(bVar, fVar, f8, f10));
    }

    private static float[] m(float f8, List list, boolean z7) {
        int size = list.size();
        float[] fArr = new float[size];
        int i8 = 1;
        while (i8 < size) {
            int i9 = i8 - 1;
            f fVar = (f) list.get(i9);
            f fVar2 = (f) list.get(i8);
            fArr[i8] = i8 == size + (-1) ? 1.0f : fArr[i9] + ((z7 ? fVar2.c().f31625a - fVar.c().f31625a : fVar.j().f31625a - fVar2.j().f31625a) / f8);
            i8++;
        }
        return fArr;
    }

    private static List n(b bVar, f fVar, float f8, float f9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int e8 = e(fVar);
        float a8 = bVar.f() ? bVar.a() : bVar.b();
        if (r(bVar, fVar) || e8 == -1) {
            if (f9 > 0.0f) {
                arrayList.add(u(fVar, f9, a8, false, f8));
            }
            return arrayList;
        }
        int i8 = e8 - fVar.i();
        float f10 = fVar.c().f31626b - (fVar.c().f31628d / 2.0f);
        if (i8 <= 0 && fVar.h().f31630f > 0.0f) {
            arrayList.add(v(fVar, f10 - fVar.h().f31630f, a8));
            return arrayList;
        }
        float f11 = 0.0f;
        int i9 = 0;
        while (i9 < i8) {
            f fVar2 = (f) arrayList.get(arrayList.size() - 1);
            int i10 = e8 - i9;
            float f12 = f11 + ((f.c) fVar.g().get(i10)).f31630f;
            int i11 = i10 + 1;
            int i12 = i9;
            f t7 = t(fVar2, e8, i11 < fVar.g().size() ? d(fVar2, ((f.c) fVar.g().get(i11)).f31627c) + 1 : 0, f10 - f12, fVar.b() + i9 + 1, fVar.i() + i9 + 1, a8);
            if (i12 == i8 - 1 && f9 > 0.0f) {
                t7 = u(t7, f9, a8, false, f8);
            }
            arrayList.add(t7);
            i9 = i12 + 1;
            f11 = f12;
        }
        return arrayList;
    }

    private static float[] o(List list, float f8, float[] fArr) {
        int size = list.size();
        float f9 = fArr[0];
        int i8 = 1;
        while (i8 < size) {
            float f10 = fArr[i8];
            if (f8 <= f10) {
                return new float[]{E3.a.b(0.0f, 1.0f, f9, f10, f8), i8 - 1, i8};
            }
            i8++;
            f9 = f10;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b bVar, f fVar, float f8, float f9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int c8 = c(fVar);
        float a8 = bVar.f() ? bVar.a() : bVar.b();
        int i8 = 1;
        if (q(fVar) || c8 == -1) {
            if (f9 > 0.0f) {
                arrayList.add(u(fVar, f9, a8, true, f8));
            }
            return arrayList;
        }
        int b8 = fVar.b() - c8;
        float f10 = fVar.c().f31626b - (fVar.c().f31628d / 2.0f);
        if (b8 <= 0 && fVar.a().f31630f > 0.0f) {
            arrayList.add(v(fVar, f10 + fVar.a().f31630f, a8));
            return arrayList;
        }
        int i9 = 0;
        float f11 = 0.0f;
        while (i9 < b8) {
            f fVar2 = (f) arrayList.get(arrayList.size() - i8);
            int i10 = c8 + i9;
            int size = fVar.g().size() - i8;
            float f12 = f11 + ((f.c) fVar.g().get(i10)).f31630f;
            int i11 = i10 - i8;
            int b9 = i11 >= 0 ? b(fVar2, ((f.c) fVar.g().get(i11)).f31627c) - i8 : size;
            int i12 = i9;
            f t7 = t(fVar2, c8, b9, f10 + f12, (fVar.b() - i9) - 1, (fVar.i() - i9) - 1, a8);
            if (i12 == b8 - 1 && f9 > 0.0f) {
                t7 = u(t7, f9, a8, true, f8);
            }
            arrayList.add(t7);
            i9 = i12 + 1;
            f11 = f12;
            i8 = 1;
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f31626b - (fVar.a().f31628d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int b8 = bVar.b();
        if (bVar.f()) {
            b8 = bVar.a();
        }
        return fVar.h().f31626b + (fVar.h().f31628d / 2.0f) <= ((float) b8) && fVar.h() == fVar.k();
    }

    private static f s(List list, float f8, float[] fArr) {
        float[] o8 = o(list, f8, fArr);
        return f.m((f) list.get((int) o8[1]), (f) list.get((int) o8[2]), o8[0]);
    }

    private static f t(f fVar, int i8, int i9, float f8, int i10, int i11, float f9) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i9, (f.c) arrayList.remove(i8));
        f.b bVar = new f.b(fVar.f(), f9);
        int i12 = 0;
        while (i12 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i12);
            float f10 = cVar.f31628d;
            bVar.e(f8 + (f10 / 2.0f), cVar.f31627c, f10, i12 >= i10 && i12 <= i11, cVar.f31629e, cVar.f31630f);
            f8 += cVar.f31628d;
            i12++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f8, float f9, boolean z7, float f10) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f9);
        float l8 = f8 / fVar.l();
        float f11 = z7 ? f8 : 0.0f;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i8);
            if (cVar.f31629e) {
                bVar.e(cVar.f31626b, cVar.f31627c, cVar.f31628d, false, true, cVar.f31630f);
            } else {
                boolean z8 = i8 >= fVar.b() && i8 <= fVar.i();
                float f12 = cVar.f31628d - l8;
                float b8 = d.b(f12, fVar.f(), f10);
                float f13 = (f12 / 2.0f) + f11;
                float f14 = f13 - cVar.f31626b;
                bVar.f(f13, b8, f12, z8, false, cVar.f31630f, z7 ? f14 : 0.0f, z7 ? 0.0f : f14);
                f11 += f12;
            }
            i8++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f8, float f9) {
        return t(fVar, 0, 0, f8, fVar.b(), fVar.i(), f9);
    }

    f g() {
        return this.f31633a;
    }

    f h() {
        return (f) this.f31635c.get(r0.size() - 1);
    }

    Map i(int i8, int i9, int i10, boolean z7) {
        float f8 = this.f31633a.f();
        HashMap hashMap = new HashMap();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i8) {
                break;
            }
            int i13 = z7 ? (i8 - i11) - 1 : i11;
            if (i13 * f8 * (z7 ? -1 : 1) > i10 - this.f31639g || i11 >= i8 - this.f31635c.size()) {
                Integer valueOf = Integer.valueOf(i13);
                List list = this.f31635c;
                hashMap.put(valueOf, (f) list.get(AbstractC6779a.b(i12, 0, list.size() - 1)));
                i12++;
            }
            i11++;
        }
        int i14 = 0;
        for (int i15 = i8 - 1; i15 >= 0; i15--) {
            int i16 = z7 ? (i8 - i15) - 1 : i15;
            if (i16 * f8 * (z7 ? -1 : 1) < i9 + this.f31638f || i15 < this.f31634b.size()) {
                Integer valueOf2 = Integer.valueOf(i16);
                List list2 = this.f31634b;
                hashMap.put(valueOf2, (f) list2.get(AbstractC6779a.b(i14, 0, list2.size() - 1)));
                i14++;
            }
        }
        return hashMap;
    }

    public f j(float f8, float f9, float f10) {
        return k(f8, f9, f10, false);
    }

    f k(float f8, float f9, float f10, boolean z7) {
        float b8;
        List list;
        float[] fArr;
        float f11 = this.f31638f + f9;
        float f12 = f10 - this.f31639g;
        float f13 = l().a().f31631g;
        float f14 = h().h().f31632h;
        if (this.f31638f == f13) {
            f11 += f13;
        }
        if (this.f31639g == f14) {
            f12 -= f14;
        }
        if (f8 < f11) {
            b8 = E3.a.b(1.0f, 0.0f, f9, f11, f8);
            list = this.f31634b;
            fArr = this.f31636d;
        } else {
            if (f8 <= f12) {
                return this.f31633a;
            }
            b8 = E3.a.b(0.0f, 1.0f, f12, f10, f8);
            list = this.f31635c;
            fArr = this.f31637e;
        }
        return z7 ? a(list, b8, fArr) : s(list, b8, fArr);
    }

    f l() {
        return (f) this.f31634b.get(r0.size() - 1);
    }
}
