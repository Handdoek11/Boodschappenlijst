package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* loaded from: classes.dex */
abstract class X extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f7723a;

    public X(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f7723a = resources;
    }

    final Drawable a(int i8) {
        return super.getDrawable(i8);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i8) {
        return this.f7723a.getAnimation(i8);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i8) {
        return this.f7723a.getBoolean(i8);
    }

    @Override // android.content.res.Resources
    public int getColor(int i8) {
        return this.f7723a.getColor(i8);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i8) {
        return this.f7723a.getColorStateList(i8);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f7723a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i8) {
        return this.f7723a.getDimension(i8);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i8) {
        return this.f7723a.getDimensionPixelOffset(i8);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i8) {
        return this.f7723a.getDimensionPixelSize(i8);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f7723a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i8, Resources.Theme theme) {
        return p0.h.e(this.f7723a, i8, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i8, int i9) {
        return p0.h.f(this.f7723a, i8, i9, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i8, int i9, int i10) {
        return this.f7723a.getFraction(i8, i9, i10);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f7723a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i8) {
        return this.f7723a.getIntArray(i8);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i8) {
        return this.f7723a.getInteger(i8);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i8) {
        return this.f7723a.getLayout(i8);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i8) {
        return this.f7723a.getMovie(i8);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i8, int i9, Object... objArr) {
        return this.f7723a.getQuantityString(i8, i9, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i8, int i9) {
        return this.f7723a.getQuantityText(i8, i9);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i8) {
        return this.f7723a.getResourceEntryName(i8);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i8) {
        return this.f7723a.getResourceName(i8);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i8) {
        return this.f7723a.getResourcePackageName(i8);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i8) {
        return this.f7723a.getResourceTypeName(i8);
    }

    @Override // android.content.res.Resources
    public String getString(int i8) {
        return this.f7723a.getString(i8);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i8) {
        return this.f7723a.getStringArray(i8);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i8) {
        return this.f7723a.getText(i8);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i8) {
        return this.f7723a.getTextArray(i8);
    }

    @Override // android.content.res.Resources
    public void getValue(int i8, TypedValue typedValue, boolean z7) {
        this.f7723a.getValue(i8, typedValue, z7);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i8, int i9, TypedValue typedValue, boolean z7) {
        this.f7723a.getValueForDensity(i8, i9, typedValue, z7);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i8) {
        return this.f7723a.getXml(i8);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f7723a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i8) {
        return this.f7723a.obtainTypedArray(i8);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i8) {
        return this.f7723a.openRawResource(i8);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i8) {
        return this.f7723a.openRawResourceFd(i8);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f7723a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f7723a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f7723a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i8, int i9, Resources.Theme theme) {
        return p0.h.f(this.f7723a, i8, i9, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i8, int i9) {
        return this.f7723a.getQuantityString(i8, i9);
    }

    @Override // android.content.res.Resources
    public String getString(int i8, Object... objArr) {
        return this.f7723a.getString(i8, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i8, CharSequence charSequence) {
        return this.f7723a.getText(i8, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z7) {
        this.f7723a.getValue(str, typedValue, z7);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i8, TypedValue typedValue) {
        return this.f7723a.openRawResource(i8, typedValue);
    }
}
