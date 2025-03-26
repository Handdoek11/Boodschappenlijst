package com.headcode.ourgroceries.android;

import com.headcode.ourgroceries.android.A2;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q5.AbstractC6635a;
import s5.C6748n;
import s5.C6749o;
import s5.EnumC6750p;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f33364a = Executors.newSingleThreadExecutor();

    class a extends AbstractRunnableC5500a {

        /* renamed from: A, reason: collision with root package name */
        final /* synthetic */ EnumC6750p f33365A;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f33366w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ A2 f33367x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC5575j2 f33368y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ c f33369z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s5.h0 h0Var, String str, A2 a22, AbstractActivityC5575j2 abstractActivityC5575j2, c cVar, EnumC6750p enumC6750p) {
            super(h0Var);
            this.f33366w = str;
            this.f33367x = a22;
            this.f33368y = abstractActivityC5575j2;
            this.f33369z = cVar;
            this.f33365A = enumC6750p;
        }

        @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
        public void h(AbstractRunnableC5500a abstractRunnableC5500a) {
            d dVar;
            String str = null;
            if (abstractRunnableC5500a.d() == s5.o0.RS_SUCCESS) {
                dVar = d.NOT_FOUND;
                s5.n0 c8 = abstractRunnableC5500a.c();
                if (c8 != null && c8.z()) {
                    C6749o k8 = c8.k();
                    if (k8.t()) {
                        String q8 = k8.q();
                        if (!AbstractC6803e.o(q8)) {
                            AbstractC6635a.d("OG-BarcodeLookup", "Got item \"" + q8 + "\" for barcode " + this.f33366w);
                            str = E.b(this.f33367x.g(), q8);
                            dVar = d.FOUND_IN_DATABASE;
                        }
                    }
                }
            } else {
                AbstractC6635a.d("OG-BarcodeLookup", "Got network error looking up barcode " + this.f33366w + " (" + abstractRunnableC5500a.d() + ")");
                dVar = d.NETWORK_ERROR;
            }
            final d dVar2 = dVar;
            final String str2 = str;
            AbstractActivityC5575j2 abstractActivityC5575j2 = this.f33368y;
            final c cVar = this.f33369z;
            final String str3 = this.f33366w;
            final EnumC6750p enumC6750p = this.f33365A;
            abstractActivityC5575j2.runOnUiThread(new Runnable() { // from class: com.headcode.ourgroceries.android.D
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.a(str3, enumC6750p, str2, "", dVar2);
                }
            });
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33370a;

        static {
            int[] iArr = new int[A2.b.values().length];
            f33370a = iArr;
            try {
                iArr[A2.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33370a[A2.b.FIRST_WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33370a[A2.b.EVERY_WORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface c {
        void a(String str, EnumC6750p enumC6750p, String str2, String str3, d dVar);
    }

    public enum d {
        FOUND_IN_MASTER_LIST,
        FOUND_IN_DATABASE,
        NOT_FOUND,
        NETWORK_ERROR
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(A2.b bVar, String str) {
        if (AbstractC6803e.o(str)) {
            return str;
        }
        Locale locale = Locale.getDefault();
        int i8 = b.f33370a[bVar.ordinal()];
        return i8 != 2 ? i8 != 3 ? str.toLowerCase(locale) : AbstractC6803e.f(str, locale) : AbstractC6803e.g(str, locale);
    }

    public static void c(AbstractActivityC5575j2 abstractActivityC5575j2, String str, EnumC6750p enumC6750p, c cVar) {
        C5688z0 L7 = abstractActivityC5575j2.V0().L();
        if (L7 != null) {
            List N7 = L7.N(str);
            if (!N7.isEmpty()) {
                Z0 z02 = (Z0) N7.get(0);
                AbstractC5673x.a("barcodeMasterListHit");
                cVar.a(str, enumC6750p, z02.E(), z02.y(), d.FOUND_IN_MASTER_LIST);
                return;
            }
        }
        f33364a.execute(new a(L4.O(s5.i0.BARCODE_LOOKUP, s5.h0.J0().O(C6748n.t().v(str).w(enumC6750p).m())), str, A2.f33140n0, abstractActivityC5575j2, cVar, enumC6750p));
    }
}
