package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class P60 {

    /* renamed from: a, reason: collision with root package name */
    private final N9 f18140a;

    public P60(N9 n9) {
        this.f18140a = n9;
    }

    private static final Uri b(Uri uri, String str) {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new zzavb("Parameter already exists: dc_ms");
                            }
                            String uri2 = uri.toString();
                            int indexOf = uri2.indexOf(";adurl");
                            if (indexOf != -1) {
                                int i8 = indexOf + 1;
                                StringBuilder sb = new StringBuilder(uri2.substring(0, i8));
                                sb.append("dc_ms");
                                sb.append("=");
                                sb.append(str);
                                sb.append(";");
                                sb.append((CharSequence) uri2, i8, uri2.length());
                                return Uri.parse(sb.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int indexOf2 = uri2.indexOf(encodedPath);
                            StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                            sb2.append(";");
                            sb2.append("dc_ms");
                            sb2.append("=");
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                            return Uri.parse(sb2.toString());
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new zzavb("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzavb("Query parameter already exists: ms");
        }
        String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        if (indexOf3 == -1) {
            indexOf3 = uri3.indexOf("?adurl");
        }
        if (indexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i9 = indexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(uri3.substring(0, i9));
        sb3.append("ms");
        sb3.append("=");
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) uri3, i9, uri3.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return b(uri, this.f18140a.c().f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }
}
