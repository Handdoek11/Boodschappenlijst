package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC5114g0;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: com.android.billingclient.api.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1056d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12415a;

    /* renamed from: b, reason: collision with root package name */
    private String f12416b;

    /* renamed from: c, reason: collision with root package name */
    private String f12417c;

    /* renamed from: d, reason: collision with root package name */
    private b f12418d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC5114g0 f12419e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f12420f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12421g;

    /* renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f12422a;

        /* renamed from: b, reason: collision with root package name */
        private String f12423b;

        /* renamed from: c, reason: collision with root package name */
        private List f12424c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f12425d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12426e;

        /* renamed from: f, reason: collision with root package name */
        private b.a f12427f;

        /* synthetic */ a(E1.w wVar) {
            b.a a8 = b.a();
            b.a.e(a8);
            this.f12427f = a8;
        }

        public C1056d a() {
            ArrayList arrayList = this.f12425d;
            boolean z7 = true;
            boolean z8 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f12424c;
            boolean z9 = (list == null || list.isEmpty()) ? false : true;
            if (!z8 && !z9) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z8 && z9) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            E1.w wVar = null;
            if (!z8) {
                Iterable$EL.forEach(this.f12424c, new Consumer() { // from class: E1.v
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        androidx.appcompat.app.E.a(obj);
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                if (this.f12425d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f12425d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f12425d.get(0);
                    String e8 = skuDetails.e();
                    ArrayList arrayList2 = this.f12425d;
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i8);
                        if (!e8.equals("play_pass_subs") && !skuDetails2.e().equals("play_pass_subs") && !e8.equals(skuDetails2.e())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String i9 = skuDetails.i();
                    ArrayList arrayList3 = this.f12425d;
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i10);
                        if (!e8.equals("play_pass_subs") && !skuDetails3.e().equals("play_pass_subs") && !i9.equals(skuDetails3.i())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            C1056d c1056d = new C1056d(wVar);
            if (!z8 || ((SkuDetails) this.f12425d.get(0)).i().isEmpty()) {
                if (z9) {
                    androidx.appcompat.app.E.a(this.f12424c.get(0));
                    throw null;
                }
                z7 = false;
            }
            c1056d.f12415a = z7;
            c1056d.f12416b = this.f12422a;
            c1056d.f12417c = this.f12423b;
            c1056d.f12418d = this.f12427f.a();
            ArrayList arrayList4 = this.f12425d;
            c1056d.f12420f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            c1056d.f12421g = this.f12426e;
            List list2 = this.f12424c;
            c1056d.f12419e = list2 != null ? AbstractC5114g0.r(list2) : AbstractC5114g0.s();
            return c1056d;
        }

        public a b(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f12425d = arrayList;
            return this;
        }

        public a c(b bVar) {
            this.f12427f = b.c(bVar);
            return this;
        }
    }

    /* renamed from: com.android.billingclient.api.d$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f12428a;

        /* renamed from: b, reason: collision with root package name */
        private String f12429b;

        /* renamed from: c, reason: collision with root package name */
        private int f12430c = 0;

        /* renamed from: com.android.billingclient.api.d$b$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f12431a;

            /* renamed from: b, reason: collision with root package name */
            private String f12432b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f12433c;

            /* renamed from: d, reason: collision with root package name */
            private int f12434d = 0;

            /* synthetic */ a(E1.w wVar) {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f12433c = true;
                return aVar;
            }

            public b a() {
                boolean z7 = true;
                E1.w wVar = null;
                if (TextUtils.isEmpty(this.f12431a) && TextUtils.isEmpty(null)) {
                    z7 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.f12432b);
                if (z7 && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f12433c && !z7 && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                b bVar = new b(wVar);
                bVar.f12428a = this.f12431a;
                bVar.f12430c = this.f12434d;
                bVar.f12429b = this.f12432b;
                return bVar;
            }

            public a b(String str) {
                this.f12431a = str;
                return this;
            }

            public a c(String str) {
                this.f12432b = str;
                return this;
            }

            public a d(int i8) {
                this.f12434d = i8;
                return this;
            }

            public final a f(String str) {
                this.f12431a = str;
                return this;
            }
        }

        /* synthetic */ b(E1.w wVar) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(b bVar) {
            a a8 = a();
            a8.f(bVar.f12428a);
            a8.d(bVar.f12430c);
            a8.c(bVar.f12429b);
            return a8;
        }

        final int b() {
            return this.f12430c;
        }

        final String d() {
            return this.f12428a;
        }

        final String e() {
            return this.f12429b;
        }
    }

    /* synthetic */ C1056d(E1.w wVar) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f12418d.b();
    }

    final C1057e c() {
        if (this.f12419e.isEmpty()) {
            return H.f12307l;
        }
        androidx.appcompat.app.E.a(this.f12419e.get(0));
        if (1 >= this.f12419e.size()) {
            throw null;
        }
        androidx.appcompat.app.E.a(this.f12419e.get(1));
        throw null;
    }

    public final String d() {
        return this.f12416b;
    }

    public final String e() {
        return this.f12417c;
    }

    public final String f() {
        return this.f12418d.d();
    }

    public final String g() {
        return this.f12418d.e();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12420f);
        return arrayList;
    }

    public final List i() {
        return this.f12419e;
    }

    public final boolean q() {
        return this.f12421g;
    }

    final boolean r() {
        return (this.f12416b == null && this.f12417c == null && this.f12418d.e() == null && this.f12418d.b() == 0 && !Collection.EL.stream(this.f12419e).anyMatch(new Predicate() { // from class: E1.u
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                androidx.appcompat.app.E.a(obj);
                return false;
            }
        }) && !this.f12415a && !this.f12421g) ? false : true;
    }
}
