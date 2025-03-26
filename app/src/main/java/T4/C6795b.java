package t4;

import A3.AbstractC0376j;
import android.content.Context;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5836j;
import j2.u;
import java.nio.charset.Charset;
import m4.B;
import m4.O;
import p4.AbstractC6384F;
import q4.j;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6795b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f43873c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f43874d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f43875e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC5834h f43876f = new InterfaceC5834h() { // from class: t4.a
        @Override // h2.InterfaceC5834h
        public final Object apply(Object obj) {
            return C6795b.d((AbstractC6384F) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C6798e f43877a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5834h f43878b;

    C6795b(C6798e c6798e, InterfaceC5834h interfaceC5834h) {
        this.f43877a = c6798e;
        this.f43878b = interfaceC5834h;
    }

    public static C6795b b(Context context, u4.j jVar, O o8) {
        u.f(context);
        InterfaceC5836j g8 = u.c().g(new com.google.android.datatransport.cct.a(f43874d, f43875e));
        C5829c b8 = C5829c.b("json");
        InterfaceC5834h interfaceC5834h = f43876f;
        return new C6795b(new C6798e(g8.a("FIREBASE_CRASHLYTICS_REPORT", AbstractC6384F.class, b8, interfaceC5834h), jVar.b(), o8), interfaceC5834h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(AbstractC6384F abstractC6384F) {
        return f43873c.M(abstractC6384F).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            sb.append(str.charAt(i8));
            if (str2.length() > i8) {
                sb.append(str2.charAt(i8));
            }
        }
        return sb.toString();
    }

    public AbstractC0376j c(B b8, boolean z7) {
        return this.f43877a.i(b8, z7).a();
    }
}
