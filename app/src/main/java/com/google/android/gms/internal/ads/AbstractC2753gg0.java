package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2753gg0 extends AbstractC4601xf0 {

    /* renamed from: t, reason: collision with root package name */
    final CharSequence f22417t;

    /* renamed from: u, reason: collision with root package name */
    int f22418u = 0;

    /* renamed from: v, reason: collision with root package name */
    int f22419v = Integer.MAX_VALUE;

    protected AbstractC2753gg0(C2970ig0 c2970ig0, CharSequence charSequence) {
        this.f22417t = charSequence;
    }

    abstract int b(int i8);

    abstract int c(int i8);

    @Override // com.google.android.gms.internal.ads.AbstractC4601xf0
    protected final /* bridge */ /* synthetic */ Object zza() {
        int b8;
        int i8 = this.f22418u;
        while (true) {
            int i9 = this.f22418u;
            if (i9 == -1) {
                a();
                return null;
            }
            int c8 = c(i9);
            if (c8 == -1) {
                c8 = this.f22417t.length();
                this.f22418u = -1;
                b8 = -1;
            } else {
                b8 = b(c8);
                this.f22418u = b8;
            }
            if (b8 != i8) {
                if (i8 < c8) {
                    this.f22417t.charAt(i8);
                }
                if (i8 < c8) {
                    this.f22417t.charAt(c8 - 1);
                }
                int i10 = this.f22419v;
                if (i10 == 1) {
                    c8 = this.f22417t.length();
                    this.f22418u = -1;
                    if (c8 > i8) {
                        this.f22417t.charAt(c8 - 1);
                    }
                } else {
                    this.f22419v = i10 - 1;
                }
                return this.f22417t.subSequence(i8, c8).toString();
            }
            int i11 = b8 + 1;
            this.f22418u = i11;
            if (i11 > this.f22417t.length()) {
                this.f22418u = -1;
            }
        }
    }
}
