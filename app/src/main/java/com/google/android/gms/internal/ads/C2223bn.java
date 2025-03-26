package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2223bn extends C2548en {

    /* renamed from: c, reason: collision with root package name */
    private final Map f20933c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f20934d;

    public C2223bn(InterfaceC4410vt interfaceC4410vt, Map map) {
        super(interfaceC4410vt, "storePicture");
        this.f20933c = map;
        this.f20934d = interfaceC4410vt.f();
    }

    public final void i() {
        if (this.f20934d == null) {
            c("Activity context is not available");
            return;
        }
        C2.v.t();
        if (!new C1759Se(this.f20934d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f20933c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        C2.v.t();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources f8 = C2.v.s().f();
        C2.v.t();
        AlertDialog.Builder l8 = G2.D0.l(this.f20934d);
        l8.setTitle(f8 != null ? f8.getString(A2.d.f162n) : "Save image");
        l8.setMessage(f8 != null ? f8.getString(A2.d.f163o) : "Allow Ad to store image in Picture gallery?");
        l8.setPositiveButton(f8 != null ? f8.getString(A2.d.f164p) : "Accept", new DialogInterfaceOnClickListenerC2017Zm(this, str, lastPathSegment));
        l8.setNegativeButton(f8 != null ? f8.getString(A2.d.f165q) : "Decline", new DialogInterfaceOnClickListenerC2114an(this));
        l8.create().show();
    }
}
