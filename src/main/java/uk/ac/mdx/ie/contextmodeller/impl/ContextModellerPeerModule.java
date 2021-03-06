/*
 * Copyright 2015 The ContextModeller Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.mdx.ie.contextmodeller.impl;

import org.modelio.api.module.IModuleAPIConfiguration;
import org.modelio.vbasic.version.Version;

import uk.ac.mdx.ie.contextmodeller.api.IContextModellerPeerModule;

/**
 * Implementation of Module services <br>
 * When a module is built using the MDA Modeler tool, a public interface is
 * generated and accessible for the other module developments. <br>
 * The main class that allows developpers to get specific module services has to
 * implement the current interface. <br>
 * Each mda component brings a specific interface that inherit from this one and
 * gives all the desired module services.
 *
 */
public class ContextModellerPeerModule implements IContextModellerPeerModule {
	private ContextModellerModule module;

	private IModuleAPIConfiguration peerConfiguration;

	public ContextModellerPeerModule(ContextModellerModule statModuleModule,
			IModuleAPIConfiguration peerConfiguration) {
		super();
		this.module = statModuleModule;
		this.peerConfiguration = peerConfiguration;
	}

	public void init() {

	}

	/**
	 * @see org.modelio.api.module.IPeerModule#getConfiguration()
	 */
	@Override
	public IModuleAPIConfiguration getConfiguration() {
		return this.peerConfiguration;
	}

	/**
	 * @see org.modelio.api.module.IPeerModule#getDescription()
	 */
	@Override
	public String getDescription() {
		return this.module.getDescription();
	}

	/**
	 * @see org.modelio.api.module.IPeerModule#getName()
	 */
	@Override
	public String getName() {
		return this.module.getName();
	}

	/**
	 * @see org.modelio.api.module.IPeerModule#getVersion()
	 */
	@Override
	public Version getVersion() {
		return this.module.getVersion();
	}

}
