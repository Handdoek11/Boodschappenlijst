package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.k;
import com.adadapted.android.sdk.constants.Config;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes.dex */
public final class US extends AbstractBinderC3309ln {

    /* renamed from: o, reason: collision with root package name */
    final Map f19373o = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    private final Context f19374s;

    /* renamed from: t, reason: collision with root package name */
    private final HN f19375t;

    /* renamed from: u, reason: collision with root package name */
    private final H2.u f19376u;

    /* renamed from: v, reason: collision with root package name */
    private final JS f19377v;

    /* renamed from: w, reason: collision with root package name */
    private String f19378w;

    /* renamed from: x, reason: collision with root package name */
    private String f19379x;

    public US(Context context, JS js, H2.u uVar, HN hn) {
        this.f19374s = context;
        this.f19375t = hn;
        this.f19376u = uVar;
        this.f19377v = js;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B() {
        /*
            r6 = this;
            C2.v.t()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.f19374s     // Catch: android.os.RemoteException -> L22
            G2.T r0 = G2.D0.a(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.f19374s     // Catch: android.os.RemoteException -> L22
            i3.a r1 = i3.BinderC5853b.p2(r1)     // Catch: android.os.RemoteException -> L22
            E2.a r2 = new E2.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.f19379x     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.f19378w     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.f19373o     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.BS r5 = (com.google.android.gms.internal.ads.BS) r5     // Catch: android.os.RemoteException -> L22
            if (r5 != 0) goto L24
            java.lang.String r5 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L42
        L24:
            java.lang.String r5 = r5.c()     // Catch: android.os.RemoteException -> L22
        L28:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L22
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L22
            if (r1 != 0) goto L48
            android.content.Context r2 = r6.f19374s     // Catch: android.os.RemoteException -> L40
            i3.a r2 = i3.BinderC5853b.p2(r2)     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.f19379x     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.f19378w     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L40
            goto L48
        L40:
            r0 = move-exception
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            H2.p.e(r2, r0)
        L48:
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.JS r0 = r6.f19377v
            java.lang.String r1 = r6.f19378w
            r0.f(r1)
            java.lang.String r0 = r6.f19378w
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.wh0 r2 = com.google.android.gms.internal.ads.AbstractC4496wh0.e()
            r6.H7(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.US.B():void");
    }

    public static final PendingIntent D7(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return AbstractC3510ne0.b(context, 0, intent, AbstractC3510ne0.f25018a | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return AbstractC3510ne0.a(context, 0, intent, 201326592);
    }

    private final AlertDialog E7(Activity activity, final F2.x xVar) {
        C2.v.t();
        AlertDialog.Builder onCancelListener = G2.D0.l(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.MS
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                F2.x xVar2 = xVar;
                if (xVar2 != null) {
                    xVar2.zzb();
                }
            }
        });
        XmlResourceParser F7 = F7(A2.c.f148a);
        if (F7 == null) {
            onCancelListener.setMessage(G7(A2.d.f155g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(F7, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String x7 = x();
            if (!TextUtils.isEmpty(x7)) {
                TextView textView = (TextView) inflate.findViewById(A2.b.f146a);
                textView.setVisibility(0);
                textView.setText(x7);
            }
            BS bs = (BS) this.f19373o.get(this.f19378w);
            Drawable a8 = bs != null ? bs.a() : null;
            if (a8 != null) {
                ((ImageView) inflate.findViewById(A2.b.f147b)).setImageDrawable(a8);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(G7(A2.d.f155g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser F7(int i8) {
        Resources f8 = C2.v.s().f();
        if (f8 == null) {
            return null;
        }
        try {
            return f8.getLayout(i8);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static String G7(int i8, String str) {
        Resources f8 = C2.v.s().f();
        if (f8 == null) {
            return str;
        }
        try {
            return f8.getString(i8);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void H7(String str, String str2, Map map) {
        v7(this.f19374s, this.f19375t, this.f19377v, str, str2, map);
    }

    private final void I7(final Activity activity, final F2.x xVar) {
        C2.v.t();
        if (androidx.core.app.n.b(activity).a()) {
            B();
            J7(activity, xVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                H7(this.f19378w, "asnpdi", AbstractC4496wh0.e());
                return;
            }
            C2.v.t();
            AlertDialog.Builder l8 = G2.D0.l(activity);
            l8.setTitle(G7(A2.d.f154f, "Allow app to send you notifications?")).setPositiveButton(G7(A2.d.f152d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.NS
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f17532o.w7(activity, xVar, dialogInterface, i8);
                }
            }).setNegativeButton(G7(A2.d.f153e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.OS
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f17888o.x7(xVar, dialogInterface, i8);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.PS
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f18186o.y7(xVar, dialogInterface);
                }
            });
            l8.create().show();
            H7(this.f19378w, "rtsdi", AbstractC4496wh0.e());
        }
    }

    private final void J7(Activity activity, F2.x xVar) {
        AlertDialog E7 = E7(activity, xVar);
        E7.show();
        Timer timer = new Timer();
        timer.schedule(new TS(this, E7, timer, xVar), Config.DEFAULT_EVENT_POLLING);
    }

    public static void u7(Context context, HN hn, JS js, String str, String str2) {
        v7(context, hn, js, str, str2, new HashMap());
    }

    public static void v7(Context context, HN hn, JS js, String str, String str2, Map map) {
        String str3;
        String str4 = true != C2.v.s().a(context) ? "offline" : "online";
        if (hn != null) {
            GN a8 = hn.a();
            a8.b("gqi", str);
            a8.b("action", str2);
            a8.b("device_connectivity", str4);
            a8.b("event_timestamp", String.valueOf(C2.v.c().a()));
            for (Map.Entry entry : map.entrySet()) {
                a8.b((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = a8.e();
        } else {
            str3 = "";
        }
        js.g(new LS(C2.v.c().a(), str, str3, 2));
    }

    private final String x() {
        BS bs = (BS) this.f19373o.get(this.f19378w);
        return bs == null ? "" : bs.b();
    }

    final /* synthetic */ void A7(F2.x xVar, DialogInterface dialogInterface, int i8) {
        this.f19377v.f(this.f19378w);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H7(this.f19378w, "dialog_click", hashMap);
        if (xVar != null) {
            xVar.zzb();
        }
    }

    final /* synthetic */ void B7(F2.x xVar, DialogInterface dialogInterface) {
        this.f19377v.f(this.f19378w);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H7(this.f19378w, "dialog_click", hashMap);
        if (xVar != null) {
            xVar.zzb();
        }
    }

    public final void C7(String str, HI hi) {
        String k02 = hi.k0();
        String b8 = hi.b();
        String str2 = "";
        if (TextUtils.isEmpty(k02)) {
            k02 = b8 != null ? b8 : "";
        }
        InterfaceC1938Xg Z7 = hi.Z();
        if (Z7 != null) {
            try {
                str2 = Z7.b().toString();
            } catch (RemoteException unused) {
            }
        }
        InterfaceC1938Xg a02 = hi.a0();
        Drawable drawable = null;
        if (a02 != null) {
            try {
                InterfaceC5852a c8 = a02.c();
                if (c8 != null) {
                    drawable = (Drawable) BinderC5853b.J0(c8);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f19373o.put(str, new C4473wS(k02, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void H0(InterfaceC5852a interfaceC5852a) {
        WS ws = (WS) BinderC5853b.J0(interfaceC5852a);
        final Activity a8 = ws.a();
        final F2.x b8 = ws.b();
        this.f19378w = ws.c();
        this.f19379x = ws.d();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.q8)).booleanValue()) {
            I7(a8, b8);
            return;
        }
        H7(this.f19378w, "dialog_impression", AbstractC4496wh0.e());
        C2.v.t();
        AlertDialog.Builder l8 = G2.D0.l(a8);
        l8.setTitle(G7(A2.d.f161m, "Open ad when you're back online.")).setMessage(G7(A2.d.f160l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(G7(A2.d.f158j, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.QS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f18465o.z7(a8, b8, dialogInterface, i8);
            }
        }).setNegativeButton(G7(A2.d.f159k, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.RS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f18652o.A7(b8, dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.SS
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f18903o.B7(b8, dialogInterface);
            }
        });
        l8.create().show();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void K0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean a8 = C2.v.s().a(this.f19374s);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == a8 ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f19374s.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f19374s.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            H7(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f19377v.getWritableDatabase();
                if (r8 == 1) {
                    this.f19377v.j(writableDatabase, this.f19376u, stringExtra2);
                } else {
                    JS.l(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e8) {
                H2.p.d("Failed to get writable offline buffering database: ".concat(e8.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void N5(InterfaceC5852a interfaceC5852a, String str, String str2) {
        q7(interfaceC5852a, new E2.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void P5(String[] strArr, int[] iArr, InterfaceC5852a interfaceC5852a) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (strArr[i8].equals("android.permission.POST_NOTIFICATIONS")) {
                WS ws = (WS) BinderC5853b.J0(interfaceC5852a);
                Activity a8 = ws.a();
                F2.x b8 = ws.b();
                HashMap hashMap = new HashMap();
                if (iArr[i8] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    B();
                    J7(a8, b8);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (b8 != null) {
                        b8.zzb();
                    }
                }
                H7(this.f19378w, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void e() {
        final H2.u uVar = this.f19376u;
        this.f19377v.h(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.CS
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                JS.e(uVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void q7(InterfaceC5852a interfaceC5852a, E2.a aVar) {
        Bitmap bitmap;
        String str;
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        String str2 = aVar.f2142o;
        String str3 = aVar.f2143s;
        String str4 = aVar.f2144t;
        String x7 = x();
        C2.v.u().g(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent D7 = D7(context, "offline_notification_clicked", str3, str2);
        PendingIntent D72 = D7(context, "offline_notification_dismissed", str3, str2);
        k.e eVar = new k.e(context, "offline_notification_channel");
        if (TextUtils.isEmpty(x7)) {
            eVar.j(G7(A2.d.f156h, "You are back online! Let's pick up where we left off"));
        } else {
            eVar.j(String.format(G7(A2.d.f157i, "You are back online! Continue learning about %s"), x7));
        }
        eVar.e(true).l(D72).h(D7).t(context.getApplicationInfo().icon).r(((Integer) D2.A.c().a(AbstractC3184kf.r8)).intValue());
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.t8)).booleanValue() || str4.isEmpty()) {
            bitmap = null;
        } else {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmap != null) {
            try {
                eVar.n(bitmap).v(new k.b().i(bitmap).h(null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str3, 54321, eVar.b());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e8) {
            hashMap.put("notification_not_shown_reason", e8.getMessage());
            str = "offline_notification_failed";
        }
        H7(str3, str, hashMap);
    }

    final /* synthetic */ void w7(Activity activity, F2.x xVar, DialogInterface dialogInterface, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        H7(this.f19378w, "rtsdc", hashMap);
        activity.startActivity(C2.v.u().e(activity));
        B();
        if (xVar != null) {
            xVar.zzb();
        }
    }

    final /* synthetic */ void x7(F2.x xVar, DialogInterface dialogInterface, int i8) {
        this.f19377v.f(this.f19378w);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H7(this.f19378w, "rtsdc", hashMap);
        if (xVar != null) {
            xVar.zzb();
        }
    }

    final /* synthetic */ void y7(F2.x xVar, DialogInterface dialogInterface) {
        this.f19377v.f(this.f19378w);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H7(this.f19378w, "rtsdc", hashMap);
        if (xVar != null) {
            xVar.zzb();
        }
    }

    final /* synthetic */ void z7(Activity activity, F2.x xVar, DialogInterface dialogInterface, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        H7(this.f19378w, "dialog_click", hashMap);
        I7(activity, xVar);
    }
}
