package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    final a f11257a;

    interface a {
        void a(a.b bVar);

        a.b b(int i8, int i9, int i10, Object obj);
    }

    l(a aVar) {
        this.f11257a = aVar;
    }

    private int a(List list) {
        boolean z7 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f11096a != 8) {
                z7 = true;
            } else if (z7) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i8, a.b bVar, int i9, a.b bVar2) {
        int i10 = bVar.f11099d;
        int i11 = bVar2.f11097b;
        int i12 = i10 < i11 ? -1 : 0;
        int i13 = bVar.f11097b;
        if (i13 < i11) {
            i12++;
        }
        if (i11 <= i13) {
            bVar.f11097b = i13 + bVar2.f11099d;
        }
        int i14 = bVar2.f11097b;
        if (i14 <= i10) {
            bVar.f11099d = i10 + bVar2.f11099d;
        }
        bVar2.f11097b = i14 + i12;
        list.set(i8, bVar2);
        list.set(i9, bVar);
    }

    private void d(List list, int i8, int i9) {
        a.b bVar = (a.b) list.get(i8);
        a.b bVar2 = (a.b) list.get(i9);
        int i10 = bVar2.f11096a;
        if (i10 == 1) {
            c(list, i8, bVar, i9, bVar2);
        } else if (i10 == 2) {
            e(list, i8, bVar, i9, bVar2);
        } else {
            if (i10 != 4) {
                return;
            }
            f(list, i8, bVar, i9, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int a8 = a(list);
            if (a8 == -1) {
                return;
            } else {
                d(list, a8, a8 + 1);
            }
        }
    }

    void e(List list, int i8, a.b bVar, int i9, a.b bVar2) {
        boolean z7;
        int i10 = bVar.f11097b;
        int i11 = bVar.f11099d;
        boolean z8 = false;
        if (i10 < i11) {
            if (bVar2.f11097b == i10 && bVar2.f11099d == i11 - i10) {
                z7 = false;
                z8 = true;
            } else {
                z7 = false;
            }
        } else if (bVar2.f11097b == i11 + 1 && bVar2.f11099d == i10 - i11) {
            z7 = true;
            z8 = true;
        } else {
            z7 = true;
        }
        int i12 = bVar2.f11097b;
        if (i11 < i12) {
            bVar2.f11097b = i12 - 1;
        } else {
            int i13 = bVar2.f11099d;
            if (i11 < i12 + i13) {
                bVar2.f11099d = i13 - 1;
                bVar.f11096a = 2;
                bVar.f11099d = 1;
                if (bVar2.f11099d == 0) {
                    list.remove(i9);
                    this.f11257a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i14 = bVar.f11097b;
        int i15 = bVar2.f11097b;
        a.b bVar3 = null;
        if (i14 <= i15) {
            bVar2.f11097b = i15 + 1;
        } else {
            int i16 = bVar2.f11099d;
            if (i14 < i15 + i16) {
                bVar3 = this.f11257a.b(2, i14 + 1, (i15 + i16) - i14, null);
                bVar2.f11099d = bVar.f11097b - bVar2.f11097b;
            }
        }
        if (z8) {
            list.set(i8, bVar2);
            list.remove(i9);
            this.f11257a.a(bVar);
            return;
        }
        if (z7) {
            if (bVar3 != null) {
                int i17 = bVar.f11097b;
                if (i17 > bVar3.f11097b) {
                    bVar.f11097b = i17 - bVar3.f11099d;
                }
                int i18 = bVar.f11099d;
                if (i18 > bVar3.f11097b) {
                    bVar.f11099d = i18 - bVar3.f11099d;
                }
            }
            int i19 = bVar.f11097b;
            if (i19 > bVar2.f11097b) {
                bVar.f11097b = i19 - bVar2.f11099d;
            }
            int i20 = bVar.f11099d;
            if (i20 > bVar2.f11097b) {
                bVar.f11099d = i20 - bVar2.f11099d;
            }
        } else {
            if (bVar3 != null) {
                int i21 = bVar.f11097b;
                if (i21 >= bVar3.f11097b) {
                    bVar.f11097b = i21 - bVar3.f11099d;
                }
                int i22 = bVar.f11099d;
                if (i22 >= bVar3.f11097b) {
                    bVar.f11099d = i22 - bVar3.f11099d;
                }
            }
            int i23 = bVar.f11097b;
            if (i23 >= bVar2.f11097b) {
                bVar.f11097b = i23 - bVar2.f11099d;
            }
            int i24 = bVar.f11099d;
            if (i24 >= bVar2.f11097b) {
                bVar.f11099d = i24 - bVar2.f11099d;
            }
        }
        list.set(i8, bVar2);
        if (bVar.f11097b != bVar.f11099d) {
            list.set(i9, bVar);
        } else {
            list.remove(i9);
        }
        if (bVar3 != null) {
            list.add(i8, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f11099d
            int r1 = r13.f11097b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f11097b = r1
            goto L20
        Ld:
            int r5 = r13.f11099d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f11099d = r5
            androidx.recyclerview.widget.l$a r0 = r8.f11257a
            int r1 = r11.f11097b
            java.lang.Object r5 = r13.f11098c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f11097b
            int r5 = r13.f11097b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f11097b = r5
            goto L41
        L2b:
            int r6 = r13.f11099d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.l$a r4 = r8.f11257a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f11098c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f11099d
            int r1 = r1 - r5
            r13.f11099d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f11099d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.l$a r11 = r8.f11257a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
