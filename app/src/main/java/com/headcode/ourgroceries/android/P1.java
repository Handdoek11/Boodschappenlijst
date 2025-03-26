package com.headcode.ourgroceries.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.icu.text.Collator;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.text.Html;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q5.AbstractC6635a;
import s5.C6753t;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public abstract class P1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f34309a = Uri.parse("https://www.ourgroceries.com/user-guide");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f34310b = Uri.parse("https://www.ourgroceries.com/faq");

    /* renamed from: c, reason: collision with root package name */
    private static final Uri f34311c = Uri.parse("https://www.ourgroceries.com/privacy");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f34312d = Pattern.compile("P(?:([0-9]+)W)?(?:([0-9]+)D)?", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator f34313e = new Comparator() { // from class: com.headcode.ourgroceries.android.N1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return P1.H((File) obj, (File) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator f34314f = h();

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private int f34315o = 0;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ InputMethodManager f34316s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextView f34317t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Handler f34318u;

        a(InputMethodManager inputMethodManager, TextView textView, Handler handler) {
            this.f34316s = inputMethodManager;
            this.f34317t = textView;
            this.f34318u = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34316s.showSoftInput(this.f34317t, 0)) {
                return;
            }
            int i8 = this.f34315o;
            if (i8 >= 20) {
                AbstractC6635a.a("OG-Misc", "Could not open soft keyboard; giving up");
                return;
            }
            this.f34315o = i8 + 1;
            AbstractC6635a.a("OG-Misc", "showSoftInput() failed, retrying");
            this.f34318u.postDelayed(this, 100L);
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private int f34319o = 0;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ InputMethodManager f34320s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f34321t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Handler f34322u;

        b(InputMethodManager inputMethodManager, View view, Handler handler) {
            this.f34320s = inputMethodManager;
            this.f34321t = view;
            this.f34322u = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34320s.hideSoftInputFromWindow(this.f34321t.getWindowToken(), 0)) {
                return;
            }
            int i8 = this.f34319o;
            if (i8 >= 20) {
                AbstractC6635a.a("OG-Misc", "Could not close soft keyboard; giving up");
                return;
            }
            this.f34319o = i8 + 1;
            AbstractC6635a.a("OG-Misc", "hideSoftInputFromWindow() failed, retrying");
            this.f34322u.postDelayed(this, 100L);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34323a;

        static {
            int[] iArr = new int[C6753t.b.values().length];
            f34323a = iArr;
            try {
                iArr[C6753t.b.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34323a[C6753t.b.KINDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34323a[C6753t.b.SAMSUNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class d implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        private final Comparator f34324o;

        public d(Comparator comparator) {
            this.f34324o = comparator;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return -this.f34324o.compare(obj, obj2);
        }
    }

    public static void A(InputMethodManager inputMethodManager, View view) {
        if (inputMethodManager == null || view == null || inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0)) {
            return;
        }
        AbstractC6635a.f("OG-Misc", "hideSoftInputFromWindow() failed");
    }

    public static void B(Handler handler, InputMethodManager inputMethodManager, View view) {
        handler.post(new b(inputMethodManager, view, handler));
    }

    public static boolean C(String str) {
        return Locale.getDefault().getLanguage().equals(new Locale(str).getLanguage());
    }

    public static boolean D() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private static boolean E(char c8) {
        return Character.isWhitespace(c8) || F(c8);
    }

    private static boolean F(char c8) {
        return c8 == 65279 || c8 == 8288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(String str, File file, String str2) {
        return str2.toLowerCase().endsWith(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int H(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    public static String I(Context context, long j8) {
        long j9 = j8 / 1000;
        if (j9 <= 1) {
            return context.getString(M2.f33884H3);
        }
        if (j9 < 60) {
            return context.getString(M2.f33892I3, Long.valueOf(j9));
        }
        long j10 = j9 / 60;
        if (j10 == 1) {
            return context.getString(M2.f33876G3);
        }
        if (j10 < 60) {
            return context.getString(M2.f33852D3, Long.valueOf(j10));
        }
        long j11 = j10 / 60;
        if (j11 == 1) {
            return context.getString(M2.f33868F3);
        }
        if (j11 < 24) {
            return context.getString(M2.f33844C3, Long.valueOf(j11));
        }
        long j12 = j11 / 24;
        return j12 == 1 ? context.getString(M2.f33860E3) : context.getString(M2.f33836B3, Long.valueOf(j12));
    }

    private static String J(String str) {
        return Uri.encode("utm_source=app&utm_campaign=" + str);
    }

    public static String K(CharSequence charSequence) {
        if (AbstractC6803e.o(charSequence)) {
            return "";
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length * 2);
        sb.append(charSequence.charAt(0));
        for (int i8 = 1; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (!E(sb.charAt(sb.length() - 1))) {
                if (!E(charAt)) {
                    sb.append((char) 8288);
                }
                sb.append(charAt);
            } else if (!F(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static int L(String str) {
        Matcher matcher = f34312d.matcher(AbstractC6803e.w(str));
        if (!matcher.matches()) {
            return 0;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        int parseInt = group != null ? Integer.parseInt(group) * 7 : 0;
        return group2 != null ? parseInt + Integer.parseInt(group2) : parseInt;
    }

    public static int M(int i8) {
        return (int) ((i8 / Resources.getSystem().getDisplayMetrics().density) + 0.5d);
    }

    public static void N(Context context, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, str));
    }

    public static void O(Context context) {
        a0(context, Uri.parse(String.format("https://alexa-skills.amazon.%s/apis/custom/skills/amzn1.echo-sdk-ams.app.6f432311-2f1d-4722-b692-2a9f75108e96/launch", k())));
    }

    public static void P(Context context) {
        a0(context, f34310b);
    }

    public static void Q(Context context) {
        a0(context, Uri.parse("https://www.ourgroceries.com/user-guide#google_assistant"));
    }

    public static boolean R(Context context, String str) {
        return b0(context, "market://details?id=com.headcode.ourgroceries.key&referrer=" + J(str));
    }

    public static void S(Context context) {
        a0(context, f34311c);
    }

    public static void T(Handler handler, InputMethodManager inputMethodManager, TextView textView) {
        textView.requestFocus();
        handler.post(new a(inputMethodManager, textView, handler));
    }

    public static void U(Context context, String str) {
        AbstractC5625q.w(context);
    }

    public static void V(Context context) {
        a0(context, f34309a);
    }

    public static String W(long j8) {
        if (j8 < 0) {
            return "?";
        }
        if (j8 < 1000) {
            return j8 + " bytes";
        }
        long j9 = j8 / 1000;
        if (j9 < 1000) {
            return j9 + " kB";
        }
        long j10 = j9 / 1000;
        if (j10 < 1000) {
            return j10 + " MB";
        }
        return (j10 / 1000) + " GB";
    }

    public static void X(View view, Context context, String str) {
        String str2;
        String str3;
        C6753t.b l8 = l(context);
        String packageName = context.getPackageName();
        String J7 = J(str);
        int i8 = c.f34323a[l8.ordinal()];
        if (i8 == 1) {
            str2 = "http://play.google.com/store/apps/details?id=" + packageName + "&referrer=" + J7;
            str3 = "market://details?id=" + packageName + "&referrer=" + J7;
        } else if (i8 == 2) {
            str3 = "amzn://apps/android?p=" + packageName;
            str2 = "http://www.amazon.com/gp/mas/dl/android?p=" + packageName;
        } else {
            if (i8 != 3) {
                AbstractC6635a.b("OG-Misc", "Unknown app store " + l8);
                return;
            }
            str3 = "samsungapps://ProductDetail/" + packageName;
            str2 = "http://www.samsungapps.com/appquery/appDetail.as?appId=" + packageName;
        }
        Uri parse = Uri.parse(str3);
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e8) {
            AbstractC6635a.f("OG-Misc", "Cannot hit main URL " + parse + " (" + e8 + ")");
            Uri parse2 = Uri.parse(str2);
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", parse2));
            } catch (ActivityNotFoundException e9) {
                com.google.firebase.crashlytics.a.b().e(e9);
                AbstractC6635a.b("OG-Misc", "Cannot hit fallback URL " + parse2 + " (" + e9 + ")");
                if (view != null) {
                    V1.d(view, M2.f33841C0, true);
                }
            }
        }
    }

    public static void Y(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                FileChannel open = FileChannel.open(file.toPath(), StandardOpenOption.READ);
                try {
                    open.force(true);
                    open.close();
                } finally {
                }
            } catch (IOException | UnsupportedOperationException e8) {
                AbstractC6635a.b("OG-Misc", "Can't sync directory " + file + ": " + e8.getMessage());
            }
        }
    }

    public static void Z(Drawable drawable, int i8) {
        drawable.mutate();
        drawable.setColorFilter(i8, PorterDuff.Mode.SRC_ATOP);
        drawable.setAlpha(255);
    }

    private static boolean a0(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException e8) {
            com.google.firebase.crashlytics.a.b().e(e8);
            AbstractC6635a.b("OG-Misc", "Can't launch URI " + uri + ": " + e8.getMessage());
            return false;
        }
    }

    public static boolean b0(Context context, String str) {
        return a0(context, Uri.parse(str));
    }

    public static String c(String str) {
        if (str.length() == 13) {
            return str.substring(0, 1) + "-" + str.substring(1, 7) + "-" + str.substring(7);
        }
        if (str.length() == 12) {
            return str.substring(0, 1) + "-" + str.substring(1, 6) + "-" + str.substring(6, 11) + "-" + str.substring(11);
        }
        if (str.length() != 8) {
            return str;
        }
        return str.substring(0, 1) + "-" + str.substring(1, 7) + "-" + str.substring(7);
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void e(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void g(Context context, Menu menu) {
        int v7 = v(context, C2.f33310a, -8355712);
        for (int i8 = 0; i8 < menu.size(); i8++) {
            Drawable icon = menu.getItem(i8).getIcon();
            if (icon != null) {
                Z(icon, v7);
            }
        }
    }

    private static Comparator h() {
        if (Build.VERSION.SDK_INT < 24) {
            return new W1();
        }
        Collator collator = Collator.getInstance();
        collator.setStrength(1);
        collator.setDecomposition(17);
        if (!K1.a(collator)) {
            throw new IllegalStateException("Collator instance is not instance of RuleBasedCollator");
        }
        L1.a(collator).setNumericCollation(true);
        collator.freeze();
        return collator;
    }

    public static int i(int i8) {
        return (int) ((i8 * Resources.getSystem().getDisplayMetrics().density) + 0.5d);
    }

    public static FilenameFilter j(String str) {
        final String str2 = "." + str.toLowerCase();
        return new FilenameFilter() { // from class: com.headcode.ourgroceries.android.O1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str3) {
                return P1.G(str2, file, str3);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String k() {
        /*
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            int r1 = r0.hashCode()
            switch(r1) {
                case 2100: goto L85;
                case 2128: goto L7b;
                case 2142: goto L71;
                case 2177: goto L67;
                case 2222: goto L5d;
                case 2252: goto L53;
                case 2267: goto L49;
                case 2341: goto L3f;
                case 2347: goto L34;
                case 2374: goto L29;
                case 2475: goto L1d;
                case 2718: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L8f
        L11:
            java.lang.String r1 = "US"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 12
            goto L90
        L1d:
            java.lang.String r1 = "MX"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 10
            goto L90
        L29:
            java.lang.String r1 = "JP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 9
            goto L90
        L34:
            java.lang.String r1 = "IT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 8
            goto L90
        L3f:
            java.lang.String r1 = "IN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 7
            goto L90
        L49:
            java.lang.String r1 = "GB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 6
            goto L90
        L53:
            java.lang.String r1 = "FR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 5
            goto L90
        L5d:
            java.lang.String r1 = "ES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 4
            goto L90
        L67:
            java.lang.String r1 = "DE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 3
            goto L90
        L71:
            java.lang.String r1 = "CA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 2
            goto L90
        L7b:
            java.lang.String r1 = "BR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 1
            goto L90
        L85:
            java.lang.String r1 = "AU"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 0
            goto L90
        L8f:
            r0 = -1
        L90:
            switch(r0) {
                case 0: goto Lb4;
                case 1: goto Lb1;
                case 2: goto Lae;
                case 3: goto Lab;
                case 4: goto La8;
                case 5: goto La5;
                case 6: goto La2;
                case 7: goto L9f;
                case 8: goto L9c;
                case 9: goto L99;
                case 10: goto L96;
                default: goto L93;
            }
        L93:
            java.lang.String r0 = "com"
            return r0
        L96:
            java.lang.String r0 = "com.mx"
            return r0
        L99:
            java.lang.String r0 = "co.jp"
            return r0
        L9c:
            java.lang.String r0 = "it"
            return r0
        L9f:
            java.lang.String r0 = "in"
            return r0
        La2:
            java.lang.String r0 = "co.uk"
            return r0
        La5:
            java.lang.String r0 = "fr"
            return r0
        La8:
            java.lang.String r0 = "es"
            return r0
        Lab:
            java.lang.String r0 = "de"
            return r0
        Lae:
            java.lang.String r0 = "ca"
            return r0
        Lb1:
            java.lang.String r0 = "com.br"
            return r0
        Lb4:
            java.lang.String r0 = "com.au"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.P1.k():java.lang.String");
    }

    public static C6753t.b l(Context context) {
        return (C6753t.b) Enum.valueOf(C6753t.b.class, context.getString(M2.f33833B0));
    }

    public static String m(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    public static int n(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static long o(Context context) {
        try {
            return new StatFs(context.getFilesDir().getPath()).getAvailableBytes();
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public static String p() {
        return Build.MODEL;
    }

    public static String q() {
        return "Android";
    }

    public static String r() {
        return Build.VERSION.RELEASE;
    }

    public static Serializable s(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, cls) : (Serializable) cls.cast(bundle.getSerializable(str));
    }

    public static String t(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            com.google.firebase.crashlytics.a.b().e(e8);
            AbstractC6635a.c("OG-Misc", e8);
            return "";
        }
    }

    public static CharSequence u(Context context, int i8, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            Object obj = objArr[i9];
            if (obj instanceof String) {
                obj = TextUtils.htmlEncode((String) obj);
            }
            objArr2[i9] = obj;
        }
        CharSequence fromHtml = Html.fromHtml(String.format(Html.toHtml(new SpannedString(context.getText(i8))), objArr2));
        while (fromHtml.length() > 0 && fromHtml.charAt(fromHtml.length() - 1) == '\n') {
            fromHtml = fromHtml.subSequence(0, fromHtml.length() - 1);
        }
        return fromHtml;
    }

    public static int v(Context context, int i8, int i9) {
        return w(context.getTheme(), i8, i9);
    }

    public static int w(Resources.Theme theme, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        return theme.resolveAttribute(i8, typedValue, true) ? typedValue.data : i9;
    }

    public static long x() {
        return System.currentTimeMillis() / 1000;
    }

    public static boolean y() {
        return Camera.getNumberOfCameras() > 0;
    }

    public static boolean z(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() > 0;
    }
}
