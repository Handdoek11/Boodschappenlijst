package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4301ut extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4410vt f27133a;

    public C4301ut(InterfaceC4410vt interfaceC4410vt) {
        this.f27133a = interfaceC4410vt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC4410vt)) {
            return webView.getContext();
        }
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) webView;
        Activity f8 = interfaceC4410vt.f();
        return f8 != null ? f8 : interfaceC4410vt.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z7) {
        InterfaceC4410vt interfaceC4410vt;
        C2.b d8;
        try {
            interfaceC4410vt = this.f27133a;
        } catch (WindowManager.BadTokenException e8) {
            H2.p.h("Fail to display Dialog.", e8);
        }
        if (interfaceC4410vt != null && interfaceC4410vt.L() != null && this.f27133a.L().d() != null && (d8 = this.f27133a.L().d()) != null && !d8.c()) {
            d8.b("window." + str + "('" + str3 + "')");
            return false;
        }
        C2.v.t();
        AlertDialog.Builder l8 = G2.D0.l(context);
        l8.setTitle(str2);
        if (z7) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            l8.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC4083st(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3974rt(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3866qt(jsPromptResult)).create().show();
        } else {
            l8.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3757pt(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3648ot(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3539nt(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC4410vt)) {
            H2.p.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        F2.x O7 = ((InterfaceC4410vt) webView).O();
        if (O7 == null) {
            H2.p.g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            O7.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i8 = AbstractC4192tt.f26945a[consoleMessage.messageLevel().ordinal()];
        if (i8 == 1) {
            H2.p.d(str);
        } else if (i8 == 2) {
            H2.p.g(str);
        } else if (i8 == 3 || i8 == 4 || i8 != 5) {
            H2.p.f(str);
        } else {
            H2.p.b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f27133a.S() != null) {
            webView2.setWebViewClient(this.f27133a.S());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j8, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = 5242880 - j10;
        if (j11 <= 0) {
            quotaUpdater.updateQuota(j8);
            return;
        }
        if (j8 == 0) {
            if (j9 > j11 || j9 > 1048576) {
                j9 = 0;
            }
        } else if (j9 == 0) {
            j9 = Math.min(j8 + Math.min(131072L, j11), 1048576L);
        } else {
            if (j9 <= Math.min(1048576 - j8, j11)) {
                j8 += j9;
            }
            j9 = j8;
        }
        quotaUpdater.updateQuota(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2b
            com.google.android.gms.internal.ads.vt r0 = r3.f27133a
            C2.v.t()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = G2.D0.b(r0, r1)
            r1 = 1
            if (r0 != 0) goto L25
            com.google.android.gms.internal.ads.vt r0 = r3.f27133a
            C2.v.t()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = G2.D0.b(r0, r2)
            if (r0 == 0) goto L27
        L25:
            r0 = r1
            goto L28
        L27:
            r0 = 0
        L28:
            r5.invoke(r4, r0, r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4301ut.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        F2.x O7 = this.f27133a.O();
        if (O7 == null) {
            H2.p.g("Could not get ad overlay when hiding custom view.");
        } else {
            O7.g();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i8, WebChromeClient.CustomViewCallback customViewCallback) {
        F2.x O7 = this.f27133a.O();
        if (O7 == null) {
            H2.p.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            O7.w7(view, customViewCallback);
            O7.u7(i8);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
