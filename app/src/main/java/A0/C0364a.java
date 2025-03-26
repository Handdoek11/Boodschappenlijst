package A0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: A0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f4a;

    /* renamed from: b, reason: collision with root package name */
    private final z f5b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6c;

    public C0364a(int i8, z zVar, int i9) {
        this.f4a = i8;
        this.f5b = zVar;
        this.f6c = i9;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4a);
        this.f5b.a0(this.f6c, bundle);
    }
}
