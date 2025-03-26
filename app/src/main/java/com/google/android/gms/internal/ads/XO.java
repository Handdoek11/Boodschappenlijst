package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class XO {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20036a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f20037b;

    /* renamed from: e, reason: collision with root package name */
    private String f20040e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f20038c = ((Integer) D2.A.c().a(AbstractC3184kf.b9)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f20039d = ((Integer) D2.A.c().a(AbstractC3184kf.c9)).intValue();

    public XO(Context context) {
        this.f20036a = context;
        this.f20037b = context.getApplicationInfo();
    }

    public final JSONObject a() {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f20036a;
            String str2 = this.f20037b.packageName;
            HandlerC1968Yd0 handlerC1968Yd0 = G2.D0.f2566l;
            jSONObject.put("name", h3.e.a(context).d(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f20037b.packageName);
        C2.v.t();
        Drawable drawable = null;
        try {
            str = G2.D0.V(this.f20036a);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.f20040e.isEmpty()) {
            try {
                drawable = (Drawable) h3.e.a(this.f20036a).e(this.f20037b.packageName).f44526b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f20038c, this.f20039d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f20038c, this.f20039d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f20040e = encodeToString;
        }
        if (!this.f20040e.isEmpty()) {
            jSONObject.put("icon", this.f20040e);
            jSONObject.put("iconWidthPx", this.f20038c);
            jSONObject.put("iconHeightPx", this.f20039d);
        }
        return jSONObject;
    }
}
